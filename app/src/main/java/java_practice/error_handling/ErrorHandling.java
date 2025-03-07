package java_practice.error_handling;

public class ErrorHandling {

    static void basicTryCatchExample() {

        int[] numbers = { 1, 2, 3 };

        try {
            // This line may throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);    // we do not hit this due to Array Out of Bounds Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n[ErrorHandling][basicTryCatchExample]");
            System.out.println("Caught an ArrayIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
        }

        System.out.println("Program continues after catching the exception.");
    }

    static void usingFinallyExample() {

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);  // does not execute since we hit an Arithmetic Exception due to divide by 0.
        } catch (ArithmeticException e) {
            System.out.println("\n[ErrorHandling][usingFinallyExample]");
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }

    public static void main(String[] args) {
        basicTryCatchExample();
        usingFinallyExample();
    }
}
