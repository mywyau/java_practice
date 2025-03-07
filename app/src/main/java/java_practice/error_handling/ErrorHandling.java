package java_practice.error_handling;

public class ErrorHandling {

    static void basicTryCatchExample() {

        int[] numbers = { 1, 2, 3 };

        try {
            // This line may throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
        }

        System.out.println("Program continues after catching the exception.");
    }

    public static void main(String[] args) {
        basicTryCatchExample();
    }
}
