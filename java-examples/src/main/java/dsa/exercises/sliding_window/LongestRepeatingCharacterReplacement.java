package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the longest window made uniform with at most k replacements.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestRepeatingCharacterReplacement implements DsaExercise {
    /** Maintains the longest window fixable with at most {@code k} replacements. */
    public static int characterReplacement(String text, int k) {
        java.util.Map<Character, Integer> counts = new java.util.HashMap<>();
        int left = 0;
        int largestCount = 0;
        int best = 0;

        for (int right = 0; right < text.length(); right++) {
            char added = text.charAt(right);
            // merge(key, 1, sum) inserts 1 or adds 1 to the existing count.
            int addedCount = counts.merge(added, 1, Integer::sum);
            largestCount = Math.max(largestCount, addedCount);

            // Every character except the most frequent one needs replacement.
            while (right - left + 1 - largestCount > k) {
                counts.merge(text.charAt(left), -1, Integer::sum);
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

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
