package java_practice.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * A lambda is a function that can be stored in a variable and passed around.
 */
public class LambdaAndInterfaces {

    @FunctionalInterface
    interface Calculator {
        int calculate(int first, int second);
    }

    public static void main(String[] args) {
        // A custom functional interface has exactly one abstract method.
        Calculator add = (first, second) -> first + second;
        Calculator multiply = (first, second) -> first * second;

        System.out.println("4 + 3 = " + add.calculate(4, 3));
        System.out.println("4 * 3 = " + multiply.calculate(4, 3));

        // Java supplies common functional interfaces in java.util.function.
        Predicate<String> isLong = text -> text.length() >= 8;
        Function<String, Integer> length = String::length;
        Consumer<String> printGreeting = name -> System.out.println("Hello, " + name);
        Supplier<String> defaultName = () -> "Anonymous";

        System.out.println("Is 'functional' long? " + isLong.test("functional"));
        System.out.println("Length of 'lambda': " + length.apply("lambda"));
        printGreeting.accept("Ada");
        System.out.println("Supplied name: " + defaultName.get());
    }
}
