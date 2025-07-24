package java_practice.basics;

public class SwitchStatements {

    public void basicExpressionSwitch() {
        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };

        System.out.println("Day name: " + dayName);
    }

    public void traditionalSwitch() {
        int month = 2;
        int daysInMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                daysInMonth = 30;
        }

        System.out.println("Days in month: " + daysInMonth);
    }

    public void multipleCaseLabels() {
        int score = 85;

        String grade = switch (score) {
            case 90, 100 -> "A";
            case 80, 85, 89 -> "B";
            case 70 -> "C";
            default -> "F";
        };

        System.out.println("Grade: " + grade);
    }

    public void switchWithYield() {

        int hour = 13;

        String timeOfDay = switch (hour) {
            case 6, 7, 8, 9 -> "Morning";
            case 12, 13, 14 -> {
                String result = "Afternoon (hour: " + hour + ")";
                yield result;
            }
            default -> "Evening/Night";
        };

        System.out.println("Time: " + timeOfDay);
    }

    public enum Animal {
        DOG, CAT, RABBIT
    }

    public void switchOnEnum() {
        Animal animal = Animal.CAT;

        String sound = switch (animal) {
            case DOG -> "Woof";
            case CAT -> "Meow";
            case RABBIT -> "Squeak";
        };

        System.out.println("Animal sound: " + sound);
    }

    public void switchOnString() {
        String command = "start";

        switch (command) {
            case "start" -> System.out.println("Starting...");
            case "stop" -> System.out.println("Stopping...");
            default -> System.out.println("Unknown command");
        }
    }

    public void nestedSwitch() {
        int code = 2;
        boolean isAdmin = true;

        String result = switch (code) {
            case 1 -> "User";
            case 2 -> switch (isAdmin ? 1 : 0) {
                case 1 -> "Admin User";
                case 0 -> "Regular User";
                default -> "Unknown Sub-role";
            };
            default -> "Unknown role";
        };

        System.out.println("Role: " + result);
    }

    public void fallthroughSwitch() {
        int level = 1;

        switch (level) {
            case 1:
                System.out.println("Beginner");
            case 2:
                System.out.println("Intermediate");
            case 3:
                System.out.println("Advanced");
                break;
            default:
                System.out.println("Unknown level");
        }
    }

    public static void main(String[] args) {

        SwitchStatements ss = new SwitchStatements();

        ss.basicExpressionSwitch();
        ss.traditionalSwitch();
        ss.multipleCaseLabels();
        ss.switchWithYield();
        ss.switchOnEnum();
        ss.switchOnString();
        ss.nestedSwitch();
        ss.fallthroughSwitch();
    }
}
