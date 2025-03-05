package java_practice;

public class ForLoops {

    // Method for the first for loop
    public void printNumbers() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    // Method for the enhanced for loop
    public void printArrayElements() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}