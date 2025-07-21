package java_practice.basics;

import java.util.Arrays;
import java.util.List;

public class ForLoops {

    // 1. Basic forward loop
    public void forloopExample1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }
    }

    // 2. Enhanced for-each loop
    public void enchancedForLoop() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // 3. Nested loop
    public void nestedForLoop() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + " | j = " + j);
            }
        }
    }

    // 4. Reverse loop
    public void reverseLoop() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println("[reverseLoop]" + arr.get(i));
        }
    }

    // 5. Loop with step
    public void loopWithStep() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even index: " + i);
        }
    }

    // 6. Two-pointer loop
    public void twoPointerLoop() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int left = 0, right = arr.length - 1;

        while (left < right) {
            System.out.println(arr[left] + " + " + arr[right]);
            left++;
            right--;
        }
    }

    // 7. Grid (2D array) traversal
    public void gridTraversal() {
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.println("grid[" + row + "][" + col + "] = " + grid[row][col]);
            }
        }
    }

    // 8. Sliding window loop
    public void slidingWindowLoop() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int windowSize = 3;

        for (int i = 0; i <= arr.length - windowSize; i++) {
            int sum = 0;
            for (int j = i; j < i + windowSize; j++) {
                sum += arr[j];
            }
            System.out.println("Window sum starting at index " + i + ": " + sum);
        }
    }

    public static void main(String[] args) {
        ForLoops forLoops = new ForLoops();

        forLoops.forloopExample1();
        forLoops.enchancedForLoop();
        forLoops.nestedForLoop();
        forLoops.reverseLoop();
        forLoops.loopWithStep();
        forLoops.twoPointerLoop();
        forLoops.gridTraversal();
        forLoops.slidingWindowLoop();
    }
}
