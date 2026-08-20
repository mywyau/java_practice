package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find a target's index in a sorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ClassicBinarySearch implements DsaExercise {
    @Override
    public String problem() {
        return "Find a target's index in a sorted array.";
    }

    @Override
    public String hint() {
        return "Discard half the remaining range after each comparison.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ClassicBinarySearch().printGuide();
    }
}

