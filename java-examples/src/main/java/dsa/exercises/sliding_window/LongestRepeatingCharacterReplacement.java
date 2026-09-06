package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the longest window made uniform with at most k replacements.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestRepeatingCharacterReplacement implements DsaExercise {
    // A window is valid when non-majority characters fit the replacement budget.
    public static int characterReplacement(String text, int k) { java.util.Map<Character, Integer> counts = new java.util.HashMap<>(); int left = 0, largestCount = 0, best = 0; for (int right = 0; right < text.length(); right++) { largestCount = Math.max(largestCount, counts.merge(text.charAt(right), 1, Integer::sum)); while (right - left + 1 - largestCount > k) counts.merge(text.charAt(left++), -1, Integer::sum); best = Math.max(best, right - left + 1); } return best; }

    @Override
    public String problem() {
        return "Find the longest window made uniform with at most k replacements.";
    }

    @Override
    public String hint() {
        return "Track the most frequent character count inside the window.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new LongestRepeatingCharacterReplacement().printGuide();
    }
}
