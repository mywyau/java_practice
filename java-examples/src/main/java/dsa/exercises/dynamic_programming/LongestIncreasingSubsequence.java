package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Find the longest strictly increasing subsequence.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestIncreasingSubsequence implements DsaExercise {
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

