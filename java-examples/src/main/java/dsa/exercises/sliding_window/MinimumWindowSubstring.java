package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the smallest substring containing all required characters.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinimumWindowSubstring implements DsaExercise {
    // Expand until every requirement is met, then shrink away excess characters.
    public static String minWindow(String text, String required) {
        if (required.isEmpty()) return ""; java.util.Map<Character, Integer> need = new java.util.HashMap<>(); for (char c : required.toCharArray()) need.merge(c, 1, Integer::sum);
        int missing = required.length(), left = 0, bestStart = 0, bestLength = Integer.MAX_VALUE;
        for (int right = 0; right < text.length(); right++) { char added = text.charAt(right); int before = need.getOrDefault(added, 0); if (before > 0) missing--; need.put(added, before - 1); while (missing == 0) { if (right - left + 1 < bestLength) { bestStart = left; bestLength = right - left + 1; } char removed = text.charAt(left++); int after = need.getOrDefault(removed, 0) + 1; need.put(removed, after); if (after > 0) missing++; } }
        return bestLength == Integer.MAX_VALUE ? "" : text.substring(bestStart, bestStart + bestLength);
    }

    @Override
    public String problem() {
        return "Find the smallest substring containing all required characters.";
    }

    @Override
    public String hint() {
        return "Expand until valid, then shrink while preserving validity.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new MinimumWindowSubstring().printGuide();
    }
}
