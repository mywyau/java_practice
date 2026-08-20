package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the smallest substring containing all required characters.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinimumWindowSubstring implements DsaExercise {
    @Override
    public String problem() {
        return "Find the smallest substring containing all required characters.";
    }

    @Override
    public String hint() {
        return "Expand until valid, then shrink while preserving validity.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new MinimumWindowSubstring().printGuide();
    }
}

