package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Find the longest run of consecutive integers in any order.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestConsecutiveSequence implements DsaExercise {
    // Grow only from sequence starts, otherwise the same run would be scanned repeatedly.
    public static int longestConsecutive(int[] numbers) {
        java.util.Set<Integer> values = new java.util.HashSet<>();
        for (int number : numbers) values.add(number);
        int best = 0;
        for (int number : values) if (!values.contains(number - 1)) {
            int length = 1; while (values.contains(number + length)) length++;
            best = Math.max(best, length);
        }
        return best;
    }

    @Override
    public String problem() {
        return "Find the longest run of consecutive integers in any order.";
    }

    @Override
    public String hint() {
        return "Only grow sequences from numbers with no predecessor.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) expected time, O(n) space";
    }

    public static void main(String[] args) {
        new LongestConsecutiveSequence().printGuide();
    }
}
