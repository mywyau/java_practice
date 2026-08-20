package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the largest average among windows of size k.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MaximumAverageSubarray implements DsaExercise {
    @Override
    public String problem() {
        return "Find the largest average among windows of size k.";
    }

    @Override
    public String hint() {
        return "Update a rolling sum by adding one value and removing one.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new MaximumAverageSubarray().printGuide();
    }
}

