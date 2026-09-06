package java_practice.functional;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Small functions can be combined to create more useful operations.
 */
public class FunctionComposition {

    static Function<String, String> createUsername = String::trim;
    static Function<String, String> lowerCase = String::toLowerCase;
    static Function<String, String> replaceSpaces = value -> value.replace(' ', '.');

    static String toUsername(String name) {
        return createUsername
                .andThen(lowerCase)
                .andThen(replaceSpaces)
                .apply(name);
    }

    public static void main(String[] args) {
        System.out.println(toUsername("  Grace Hopper  "));

        Predicate<Integer> isPositive = number -> number > 0;
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

        List<Integer> numbers = List.of(-4, -1, 0, 2, 3, 8);
        numbers.stream()
                .filter(isPositiveAndEven)
                .forEach(number -> System.out.println("Positive even number: " + number));
    }
}
