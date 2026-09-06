package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Ignore punctuation and case, then test whether a string is a palindrome.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidPalindrome implements DsaExercise {
    // Compare only meaningful mirrored characters while the pointers move inward.
    public static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) right--;
            if (Character.toLowerCase(text.charAt(left++)) != Character.toLowerCase(text.charAt(right--))) return false;
        }
        return true;
    }

    @Override
    public String problem() {
        return "Ignore punctuation and case, then test whether a string is a palindrome.";
    }

    @Override
    public String hint() {
        return "Move two pointers inward and skip non-alphanumeric characters.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ValidPalindrome().printGuide();
    }
}
