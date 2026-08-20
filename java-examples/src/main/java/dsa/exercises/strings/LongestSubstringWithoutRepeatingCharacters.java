package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Find the longest substring containing no repeated characters.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestSubstringWithoutRepeatingCharacters implements DsaExercise {
    @Override
    public String problem() {
        return "Find the longest substring containing no repeated characters.";
    }

    @Override
    public String hint() {
        return "Use a sliding window and remember each character's last index.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new LongestSubstringWithoutRepeatingCharacters().printGuide();
    }
}

