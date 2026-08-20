package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Ignore punctuation and case, then test whether a string is a palindrome.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidPalindrome implements DsaExercise {
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

