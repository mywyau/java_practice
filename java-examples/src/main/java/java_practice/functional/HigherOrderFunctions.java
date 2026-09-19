package java_practice.functional;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/** Functions can receive functions, return functions, and capture values. */
public class HigherOrderFunctions {

    static <T> List<T> select(List<T> values, Predicate<? super T> predicate) {
        return values.stream().filter(predicate).toList();
    }

    // Curried form: provide arguments one at a time.
    static Function<Integer, Function<Integer, Integer>> add =
            first -> second -> first + second;

    static Function<Double, Double> addTax(double rate) {
        // The returned function closes over rate (partial application).
        return price -> price * (1 + rate);
    }

    public static void main(String[] args) {
        System.out.println(select(List.of(1, 2, 3, 4, 5), number -> number % 2 == 0));

        Function<Integer, Integer> addTen = add.apply(10);
        System.out.println("10 + 7 = " + addTen.apply(7));

        Function<Double, Double> addVat = addTax(0.20);
        System.out.printf("Price including VAT: %.2f%n", addVat.apply(50.0));
    }
}
