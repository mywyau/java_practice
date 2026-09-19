package java_practice.functional;

import java.util.List;
import java.util.Optional;

/**
 * Java cannot define one fully general Functor or Monad interface because it
 * has no higher-kinded types. It can still express their operations on each
 * concrete type: map for functors and flatMap for monads.
 */
public class FunctorAndMonad {

    static Optional<Integer> parsePositiveInteger(String text) {
        try {
            int number = Integer.parseInt(text);
            return number > 0 ? Optional.of(number) : Optional.empty();
        } catch (NumberFormatException exception) {
            return Optional.empty();
        }
    }

    static Optional<Double> reciprocal(int number) {
        return number == 0 ? Optional.empty() : Optional.of(1.0 / number);
    }

    public static void main(String[] args) {
        // Functor: map changes values while preserving the surrounding shape.
        Optional<String> optionalName = Optional.of("Ada");
        System.out.println(optionalName.map(String::length));

        List<Integer> lengths = List.of("Ada", "Grace", "Linus").stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);

        // Monad: flatMap chains operations that themselves return a context.
        Optional<Double> result = parsePositiveInteger("4")
                .flatMap(FunctorAndMonad::reciprocal);
        System.out.println(result);

        // map would produce Optional<Optional<Double>>; flatMap keeps it flat.
        Optional<Optional<Double>> nested = parsePositiveInteger("4")
                .map(FunctorAndMonad::reciprocal);
        System.out.println(nested);
    }
}
