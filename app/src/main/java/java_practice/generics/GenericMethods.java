package java_practice.generics;

public class GenericMethods {

    // A generic method to print elements in an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {  // enhanced for loop
            System.out.println(element);
        }
    }

    static Integer[]  intArray = {1, 2, 3, 4};  // you need to make it static to be able to call the array value in main

    public static void main(String[] args) {

        System.out.println("\nInteger Array:");
        printArray(intArray);   // Calls printArray with Integer

        System.out.println("\nString Array:");
        String[] strArray = {"Hello", "World"};
        printArray(strArray);   // Calls printArray with Integer

    }
}
