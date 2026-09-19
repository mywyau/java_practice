package java_practice.functional;

/** Demonstrates applicative-style validation that reports every field error. */
public class ValidationExample {

    record Registration(String username, int age) {}

    static Validation<String, String> validateUsername(String username) {
        if (username == null || username.isBlank()) {
            return Validation.invalid("Username is required");
        }
        if (username.length() < 3) {
            return Validation.invalid("Username must have at least 3 characters");
        }
        return Validation.valid(username.trim());
    }

    static Validation<String, Integer> validateAge(int age) {
        return age >= 18
                ? Validation.valid(age)
                : Validation.invalid("Age must be at least 18");
    }

    static Validation<String, Registration> validate(String username, int age) {
        return Validation.map2(
                validateUsername(username),
                validateAge(age),
                Registration::new);
    }

    static String display(Validation<String, Registration> result) {
        return result.fold(
                errors -> "Invalid: " + String.join("; ", errors),
                registration -> "Registered: " + registration);
    }

    public static void main(String[] args) {
        System.out.println(display(validate("Ada", 36)));
        System.out.println(display(validate("", 15)));
    }
}
