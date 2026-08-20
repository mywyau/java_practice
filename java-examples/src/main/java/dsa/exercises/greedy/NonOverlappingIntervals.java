package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Remove the fewest intervals to eliminate overlap.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class NonOverlappingIntervals implements DsaExercise {
    @Override
    public String problem() {
        return "Remove the fewest intervals to eliminate overlap.";
    }

    @Override
    public String hint() {
        return "Keep intervals with the earliest finishing times.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(1) extra space";
    }

    public static void main(String[] args) {
        new NonOverlappingIntervals().printGuide();
    }
}

