package java_practice.functional;

/**
 * Either keeps useful error information while allowing successful operations
 * to be chained. The first Left short-circuits the remaining flatMap calls.
 */
public class EitherExample {

    static Either<String, Integer> parseInteger(String text) {
        try {
            return Either.right(Integer.parseInt(text));
        } catch (NumberFormatException exception) {
            return Either.left("Not an integer: " + text);
        }
    }

    static Either<String, Integer> divide(int numerator, int denominator) {
        return denominator == 0
                ? Either.left("Cannot divide by zero")
                : Either.right(numerator / denominator);
    }

    static Either<String, Integer> divideText(String numerator, String denominator) {
        return parseInteger(numerator).flatMap(first ->
                parseInteger(denominator).flatMap(second -> divide(first, second)));
    }

    static String display(Either<String, Integer> result) {
        return result.fold(
                error -> "Error: " + error,
                value -> "Result: " + value);
    }

    public static void main(String[] args) {
        System.out.println(display(divideText("20", "4")));
        System.out.println(display(divideText("twenty", "4")));
        System.out.println(display(divideText("20", "0")));
    }
}
