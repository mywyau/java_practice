package java_practice.enums;

public class EnumExample1 {

    static void enumSwitchCaseExample(Day today) {
        // Example using switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("End of the work week!");
                break;
            case SUNDAY:
                System.out.println("It's weekend!");
                break;
            default:
                System.out.println("It's just another day.");
        }
    }

    public static void main(String[] args) {

        Day monday = Day.MONDAY;

        System.out.println("\nToday is " + monday);

        enumSwitchCaseExample(monday);
    }
}
