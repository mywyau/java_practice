package java_practice;

public class ForLoops {

    // for (initialization; condition; update) {
    // // Code to execute
    // }

    public void forloopExample1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration" + i);
        }
    }

    // Method for the enhanced for loop
    public void enchancedForLoop() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void nestedForLoop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " | " + "j = " + j);
            }
        }
    }

    public static void main(String[] args) {
        ForLoops forLoops = new ForLoops();

        forLoops.forloopExample1();
        forLoops.enchancedForLoop();
        forLoops.nestedForLoop();
    }

}