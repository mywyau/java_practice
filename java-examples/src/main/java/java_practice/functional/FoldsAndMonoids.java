package java_practice.functional;

import java.util.List;
import java.util.function.BinaryOperator;

/** A fold reduces many values using an identity value and a combine operation. */
public class FoldsAndMonoids {

    record Monoid<T>(T identity, BinaryOperator<T> combine) {
        T fold(List<T> values) {
            return values.stream().reduce(identity, combine);
        }
    }

    static final Monoid<Integer> SUM = new Monoid<>(0, Integer::sum);
    static final Monoid<String> TEXT = new Monoid<>("", String::concat);

    static <T> Monoid<List<T>> lists() {
        return new Monoid<>(List.of(), (left, right) -> {
            var combined = new java.util.ArrayList<>(left);
            combined.addAll(right);
            return List.copyOf(combined);
        });
    }

    public static void main(String[] args) {
        System.out.println(SUM.fold(List.of(1, 2, 3, 4)));
        System.out.println(TEXT.fold(List.of("functional ", "Java ", "works")));
        System.out.println(FoldsAndMonoids.<Integer>lists().fold(
                List.of(List.of(1, 2), List.of(3), List.of(4, 5))));
    }
}
