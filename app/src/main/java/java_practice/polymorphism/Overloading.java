package java_practice.polymorphism;

public class Overloading {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 and 3: " + add(2, 3));              // Calls first method
        System.out.println("Sum of 1, 2 and 3: " + add(1, 2, 3));      // Calls second method
        System.out.println("Sum of 5.5 and 4.5: " + add(5.5, 4.5));   // Calls third method
    }
}
