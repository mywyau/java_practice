package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the shortest positive-number window meeting a target sum.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinimumSizeSubarraySum implements DsaExercise {
    @Override
    public String problem() {
        return "Find the shortest positive-number window meeting a target sum.";
    }

    @Override
    public String hint() {
        return "Expand right and shrink left while the sum is large enough.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new MinimumSizeSubarraySum().printGuide();
    }
}

