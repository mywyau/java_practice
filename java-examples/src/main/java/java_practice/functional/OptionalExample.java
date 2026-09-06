package java_practice.functional;

import java.util.List;
import java.util.Optional;

/**
 * Optional represents a value that may or may not exist.
 */
public class OptionalExample {

    record User(int id, String name, String email) {
    }

    private static final List<User> USERS = List.of(
            new User(1, "Ada", "ada@example.com"),
            new User(2, "Grace", "grace@example.com"));

    static Optional<User> findUserById(int id) {
        return USERS.stream()
                .filter(user -> user.id() == id)
                .findFirst();
    }

    static String emailForUser(int id) {
        return findUserById(id)
                .map(User::email)
                .orElse("No email found");
    }

    static Optional<String> normalisedNickname(String nickname) {
        return Optional.ofNullable(nickname)
                .map(String::trim)
                .filter(value -> !value.isEmpty())
                .map(String::toLowerCase);
    }

    public static void main(String[] args) {
        findUserById(1)
                .ifPresent(user -> System.out.println("Found: " + user.name()));

        System.out.println("User 1 email: " + emailForUser(1));
        System.out.println("User 99 email: " + emailForUser(99));
        System.out.println("Nickname: " + normalisedNickname("  Coder  ").orElse("anonymous"));
        System.out.println("Missing nickname: " + normalisedNickname(null).orElse("anonymous"));
    }
}
