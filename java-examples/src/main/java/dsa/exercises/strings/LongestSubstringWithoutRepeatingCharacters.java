package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Find the longest substring containing no repeated characters.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestSubstringWithoutRepeatingCharacters implements DsaExercise {
    // left never moves backward, even if the repeated character is from an old window.
    public static int lengthOfLongestSubstring(String text) {
        java.util.Map<Character, Integer> lastSeen = new java.util.HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < text.length(); right++) {
            left = Math.max(left, lastSeen.getOrDefault(text.charAt(right), -1) + 1);
            lastSeen.put(text.charAt(right), right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

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
