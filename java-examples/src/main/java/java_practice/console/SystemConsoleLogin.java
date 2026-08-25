package java_practice.console;

import java.io.Console;
import java.util.Arrays;

/**
 * Demonstrates java.io.Console, including hidden password entry.
 */
public class SystemConsoleLogin {

    public static void main(String[] args) {
        Console console = System.console();

        // IDEs and Gradle often do not attach a real system console.
        if (console == null) {
            System.out.println("No system console is available.");
            System.out.println("Compile the project, then run this class directly from a terminal.");
            return;
        }

        String username = console.readLine("Username: ").trim();
        char[] password = console.readPassword("Password (input is hidden): ");

        try {
            if (username.isEmpty() || password.length == 0) {
                console.printf("Username and password must not be empty.%n");
                return;
            }

            console.printf("Thanks, %s. Your password contained %d characters.%n",
                    username, password.length);
        } finally {
            // A char[] can be cleared; an immutable String would remain in memory.
            Arrays.fill(password, '\0');
        }
    }
}
