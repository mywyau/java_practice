package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Check whether one string's permutation occurs in another.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class PermutationInString implements DsaExercise {
    @Override
    public String problem() {
        return "Check whether one string's permutation occurs in another.";
    }

    @Override
    public String hint() {
        return "Compare fixed-size character counts in a sliding window.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) alphabet space";
    }

    public static void main(String[] args) {
        new PermutationInString().printGuide();
    }
}

