package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Find the contiguous subarray with the largest sum.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MaximumSubarray implements DsaExercise {
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
        new MaximumSubarray().printGuide();
    }
}

