package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merge all overlapping numeric intervals.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MergeIntervals implements DsaExercise {
    /**
     * Sorts copied intervals by their start, then either extends the most recent
     * merged interval or starts a new one. The caller's input is left unchanged.
     */
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        int[][] sorted = Arrays.stream(intervals)
                .map(interval -> {
                    if (interval.length != 2) {
                        throw new IllegalArgumentException("Each interval needs a start and end");
                    }
                    return interval.clone();
                })
                .sorted(Comparator.comparingInt(interval -> interval[0]))
                .toArray(int[][]::new);

        List<int[]> merged = new ArrayList<>();
        merged.add(sorted[0]);
        for (int index = 1; index < sorted.length; index++) {
            int[] previous = merged.getLast();
            int[] current = sorted[index];
            if (current[0] <= previous[1]) {
                previous[1] = Math.max(previous[1], current[1]);
            } else {
                merged.add(current);
            }
        }

        return merged.toArray(int[][]::new);
    }

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
        MergeIntervals exercise = new MergeIntervals();
        exercise.printGuide();
        int[][] result = merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println("Example: " + Arrays.deepToString(result));
    }
}
