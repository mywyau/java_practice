package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Check whether one string's permutation occurs in another.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class PermutationInString implements DsaExercise {
    // An empty difference map means the fixed window has identical character counts.
    public static boolean checkInclusion(String pattern, String text) {
        if (pattern.length() > text.length()) return false;
        java.util.Map<Character, Integer> difference = new java.util.HashMap<>();
        for (char c : pattern.toCharArray()) adjust(difference, c, 1);
        for (int right = 0; right < text.length(); right++) {
            adjust(difference, text.charAt(right), -1);
            if (right >= pattern.length()) adjust(difference, text.charAt(right - pattern.length()), 1);
            if (right + 1 >= pattern.length() && difference.isEmpty()) return true;
        }
        return false;
    }

    private static void adjust(java.util.Map<Character, Integer> difference, char character, int amount) {
        int updated = difference.getOrDefault(character, 0) + amount;
        if (updated == 0) difference.remove(character); else difference.put(character, updated);
    }

    @Override
    public String problem() {
        return "Check whether one string's permutation occurs in another.";
    }

    @Override
    public String hint() {
        return "Compare fixed-size character counts in a sliding window.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) alphabet space";
    }

    public static void main(String[] args) {
        new PermutationInString().printGuide();
    }
}
