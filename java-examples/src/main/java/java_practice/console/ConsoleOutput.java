package java_practice.console;

/**
 * Demonstrates the most common ways to write text to the console.
 */
public class ConsoleOutput {

    public static void main(String[] args) {
        String name = "Michael";
        int exercisesCompleted = 7;
        double completionRate = 0.875;

        // println adds a line break after the value.
        System.out.println("Welcome to the console examples!");

        // print leaves the cursor on the same line.
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

        // printf inserts values into placeholders and lets us control formatting.
        // %s = string, %d = integer, %.1f = decimal, %% = a literal percent sign.
        System.out.printf("You completed %d exercises.%n", exercisesCompleted);
        System.out.printf("Progress: %.1f%%%n", completionRate * 100);

        // Error messages normally go to stderr, a separate output stream.
        System.err.println("Example warning: remember to close resources when finished.");
    }
}
