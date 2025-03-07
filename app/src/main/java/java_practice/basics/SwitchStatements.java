package java_practice.basics;

public class SwitchStatements {

    int day = 3;

    String dayName = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        default -> "Unknown";
    };
}