package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Find the longest contiguous palindrome.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestPalindromicSubstring implements DsaExercise {
    @Override
    public String problem() {
        return "Find the longest contiguous palindrome.";
    }

    @Override
    public String hint() {
        return "Expand around every possible odd and even center.";
    }

    @Override
    public String targetComplexity() {
        return "O(n²) time, O(1) space";
    }

    public static void main(String[] args) {
        new LongestPalindromicSubstring().printGuide();
    }
}

