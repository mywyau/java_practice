package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Find the longest strictly increasing subsequence.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestIncreasingSubsequence implements DsaExercise {
    // tails[i] is the smallest ending value found for a subsequence of length i + 1.
    public static int lengthOfLIS(int[] numbers) {
        int[] tails = new int[numbers.length]; int size = 0;
        for (int number : numbers) { int left = 0, right = size; while (left < right) { int middle = (left + right) / 2; if (tails[middle] < number) left = middle + 1; else right = middle; } tails[left] = number; if (left == size) size++; }
        return size;
    }

    @Override
    public String problem() {
        return "Find the longest strictly increasing subsequence.";
    }

    @Override
    public String hint() {
        return "Maintain smallest possible tails or use pairwise DP.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(n) space";
    }

    public static void main(String[] args) {
        new LongestIncreasingSubsequence().printGuide();
    }
}
