package java_practice.console;

import java.util.Scanner;

/**
 * Demonstrates interactive input and simple validation with Scanner.
 */
public class ScannerInput {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine().trim();

            while (name.isEmpty()) {
                System.out.print("Please enter a non-empty name: ");
                name = scanner.nextLine().trim();
            }

            int age = readNonNegativeInt(scanner, "How old are you? ");
            System.out.printf("Hello, %s! Next year you will be %d.%n", name, age + 1);
        }
    }

    private static int readNonNegativeInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                int value = Integer.parseInt(input);
                if (value >= 0) {
                    return value;
                }
                System.out.println("Please enter zero or a positive whole number.");
            } catch (NumberFormatException exception) {
                System.out.println("That is not a valid whole number. Try again.");
            }
        }
    }
}
