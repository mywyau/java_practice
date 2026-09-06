package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Find the longest contiguous palindrome.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestPalindromicSubstring implements DsaExercise {
    // Every palindrome expands from either one center character or a center gap.
    public static String longestPalindrome(String text) {
        if (text.isEmpty()) return "";
        int bestStart = 0, bestLength = 1;
        for (int center = 0; center < text.length(); center++) {
            for (int offset = 0; offset <= 1; offset++) {
                int left = center, right = center + offset;
                while (left >= 0 && right < text.length() && text.charAt(left) == text.charAt(right)) {
                    if (right - left + 1 > bestLength) { bestStart = left; bestLength = right - left + 1; }
                    left--; right++;
                }
            }
        }
        return text.substring(bestStart, bestStart + bestLength);
    }

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
