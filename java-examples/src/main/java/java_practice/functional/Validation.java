package java_practice.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Validation is similar to Either, but map2 can collect errors from independent
 * checks instead of stopping at the first failure.
 */
public sealed interface Validation<E, A>
        permits Validation.Valid, Validation.Invalid {

    static <E, A> Validation<E, A> valid(A value) {
        return new Valid<>(value);
    }

    static <E, A> Validation<E, A> invalid(E error) {
        return new Invalid<>(List.of(error));
    }

    static <E, A> Validation<E, A> invalid(List<E> errors) {
        return new Invalid<>(errors);
    }

    <T> T fold(
            Function<? super List<E>, ? extends T> onInvalid,
            Function<? super A, ? extends T> onValid);

    default <B> Validation<E, B> map(Function<? super A, ? extends B> mapper) {
        return fold(Validation::invalid, value -> Validation.valid(mapper.apply(value)));
    }

    static <E, A, B, C> Validation<E, C> map2(
            Validation<E, A> first,
            Validation<E, B> second,
            BiFunction<? super A, ? super B, ? extends C> combine) {
        return first.fold(
                firstErrors -> second.fold(
                        secondErrors -> Validation.invalid(concat(firstErrors, secondErrors)),
                        ignored -> Validation.invalid(firstErrors)),
                firstValue -> second.fold(
                        Validation::invalid,
                        secondValue -> Validation.valid(combine.apply(firstValue, secondValue))));
    }

    private static <E> List<E> concat(List<E> first, List<E> second) {
        List<E> combined = new ArrayList<>(first);
        combined.addAll(second);
        return List.copyOf(combined);
    }

    record Valid<E, A>(A value) implements Validation<E, A> {
        public Valid {
            Objects.requireNonNull(value, "value");
        }

        @Override
        public <T> T fold(
                Function<? super List<E>, ? extends T> onInvalid,
                Function<? super A, ? extends T> onValid) {
            return onValid.apply(value);
        }
    }

    record Invalid<E, A>(List<E> errors) implements Validation<E, A> {
        public Invalid {
            errors = List.copyOf(errors);
            if (errors.isEmpty()) {
                throw new IllegalArgumentException("Invalid must contain an error");
            }
        }

        @Override
        public <T> T fold(
                Function<? super List<E>, ? extends T> onInvalid,
                Function<? super A, ? extends T> onValid) {
            return onInvalid.apply(errors);
        }
    }
}
