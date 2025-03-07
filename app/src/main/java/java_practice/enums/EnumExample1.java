package java_practice.enums;

public class EnumExample1 {

    static void weekdaySwitchCaseExample(Day today) {
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

    static void planetMassExample(Planet planet) {

        switch (planet) {
            case Mercury:
                System.out.println("Mercury's Mass = " + planet.getMass() + "kg");
                break;
            case Venus:
                System.out.println("Venus's Mass = " + planet.getMass() + "kg");
                break;
            case Earth:
                System.out.println("Earth's Mass = " + planet.getMass() + "kg");
                break;
            default:
                System.out.println("Planet's Mass = " + planet.getMass() + "kg");
        }
    }

    static void planetRadiusExample(Planet planet) {

        switch (planet) {
            case Mercury:
                System.out.println("Mercury's Radius = " + planet.getRadius() + "km");
                break;
            case Venus:
                System.out.println("Venus's Radius = " + planet.getRadius() + "km");
                break;
            case Earth:
                System.out.println("Earth's Radius = " + planet.getRadius() + "km");
                break;
            default:
                System.out.println("Planet's Radius = " + planet.getRadius() + "km");
        }
    }


    public static void main(String[] args) {

        Day monday = Day.MONDAY;
        System.out.println("\nToday is " + monday);
        System.out.println("\n[EnumExample1][weekdaySwitchCaseExample]");
        weekdaySwitchCaseExample(monday);

        Planet mercury = Planet.Mercury;
        System.out.println("\n[EnumExample1][planetMassExample]");
        planetMassExample(mercury);


        Planet venus = Planet.Venus;
        System.out.println("\n[EnumExample1][planetRadiusExample]");
        planetRadiusExample(venus);
    }
}
