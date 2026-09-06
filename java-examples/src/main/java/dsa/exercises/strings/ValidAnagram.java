package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Decide whether two strings contain identical character counts.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidAnagram implements DsaExercise {
    // Count up for one word and down for the other; a valid anagram leaves no counts.
    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) return false;
        java.util.Map<Character, Integer> counts = new java.util.HashMap<>();
        for (char c : first.toCharArray()) counts.merge(c, 1, Integer::sum);
        for (char c : second.toCharArray()) {
            Integer count = counts.get(c);
            if (count == null) return false;
            if (count == 1) counts.remove(c); else counts.put(c, count - 1);
        }
        return counts.isEmpty();
    }

    @Override
    public String problem() {
        return "Decide whether two strings contain identical character counts.";
    }

    @Override
    public String hint() {
        return "Count characters in one string and subtract counts from the other.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) alphabet space";
    }

    public static void main(String[] args) {
        new ValidAnagram().printGuide();
    }
}
