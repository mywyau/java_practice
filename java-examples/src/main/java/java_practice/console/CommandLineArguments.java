package java_practice.console;

import java.util.Arrays;

/**
 * Demonstrates values supplied after the class name when starting a program.
 */
public class CommandLineArguments {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were supplied.");
            System.out.println("Try running this example with: --args=\"Ada Java console\"");
            return;
        }

        System.out.printf("You supplied %d argument(s):%n", args.length);

        for (int index = 0; index < args.length; index++) {
            System.out.printf("  args[%d] = %s%n", index, args[index]);
        }

        System.out.println("All arguments as a list: " + Arrays.toString(args));
    }
}
