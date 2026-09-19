package java_practice.functional;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A value with one of two possible types. By convention Left is an error and
 * Right is a successful result.
 */
public sealed interface Either<L, R> permits Either.Left, Either.Right {

    static <L, R> Either<L, R> left(L error) {
        return new Left<>(error);
    }

    static <L, R> Either<L, R> right(R value) {
        return new Right<>(value);
    }

    <T> T fold(
            Function<? super L, ? extends T> onLeft,
            Function<? super R, ? extends T> onRight);

    default <T> Either<L, T> map(Function<? super R, ? extends T> mapper) {
        return fold(Either::left, value -> Either.right(mapper.apply(value)));
    }

    default <T> Either<L, T> flatMap(
            Function<? super R, ? extends Either<L, T>> mapper) {
        return fold(Either::left, mapper::apply);
    }

    default <T> Either<T, R> mapLeft(Function<? super L, ? extends T> mapper) {
        return fold(error -> Either.left(mapper.apply(error)), Either::right);
    }

    default R getOrElse(Supplier<? extends R> fallback) {
        return fold(ignored -> fallback.get(), Function.identity());
    }

    default boolean isRight() {
        return fold(ignored -> false, ignored -> true);
    }

    record Left<L, R>(L error) implements Either<L, R> {
        public Left {
            Objects.requireNonNull(error, "error");
        }

        @Override
        public <T> T fold(
                Function<? super L, ? extends T> onLeft,
                Function<? super R, ? extends T> onRight) {
            return onLeft.apply(error);
        }
    }

    record Right<L, R>(R value) implements Either<L, R> {
        public Right {
            Objects.requireNonNull(value, "value");
        }

        @Override
        public <T> T fold(
                Function<? super L, ? extends T> onLeft,
                Function<? super R, ? extends T> onRight) {
            return onRight.apply(value);
        }
    }
}
