package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find the first and last index of a repeated target.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class FirstAndLastPosition implements DsaExercise {
    @Override
    public String problem() {
        return "Find the first and last index of a repeated target.";
    }

    @Override
    public String hint() {
        return "Run boundary-focused binary search twice.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) time, O(1) space";
    }

    public static void main(String[] args) {
        new FirstAndLastPosition().printGuide();
    }
}

