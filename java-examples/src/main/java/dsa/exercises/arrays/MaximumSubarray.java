package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Find the contiguous subarray with the largest sum.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MaximumSubarray implements DsaExercise {
    /**
     * Uses Kadane's algorithm: at each value, either extend the current subarray
     * or start a new one. The global maximum remembers the best choice so far.
     */
    public static int maxSubArray(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("numbers must not be empty");
        }

        int currentSum = numbers[0];
        int bestSum = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            currentSum = Math.max(numbers[index], currentSum + numbers[index]);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }

    @Override
    public String problem() {
        return "Find the contiguous subarray with the largest sum.";
    }

    @Override
    public String hint() {
        return "At each position, choose between extending or restarting the subarray.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        MaximumSubarray exercise = new MaximumSubarray();
        exercise.printGuide();
        System.out.println("Example: " + maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
