package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Merge all overlapping numeric intervals.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MergeIntervals implements DsaExercise {
    @Override
    public String problem() {
        return "Merge all overlapping numeric intervals.";
    }

    @Override
    public String hint() {
        return "Sort by start, then compare with the last merged interval.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(n) space";
    }

    public static void main(String[] args) {
        new MergeIntervals().printGuide();
    }
}

