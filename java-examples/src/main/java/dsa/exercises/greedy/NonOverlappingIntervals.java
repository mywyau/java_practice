package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Remove the fewest intervals to eliminate overlap.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class NonOverlappingIntervals implements DsaExercise {
    // Keeping the earliest finish leaves maximum room for future intervals.
    public static int eraseOverlapIntervals(int[][] intervals) { if (intervals.length == 0) return 0; int[][] sorted = intervals.clone(); java.util.Arrays.sort(sorted, java.util.Comparator.comparingInt(value -> value[1])); int removed = 0, end = sorted[0][1]; for (int i = 1; i < sorted.length; i++) if (sorted[i][0] < end) removed++; else end = sorted[i][1]; return removed; }

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
