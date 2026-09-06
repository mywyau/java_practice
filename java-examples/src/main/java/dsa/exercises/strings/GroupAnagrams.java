package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Group words that are anagrams of one another.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class GroupAnagrams implements DsaExercise {
    // Sorted letters form a canonical key shared by every anagram in a group.
    public static java.util.List<java.util.List<String>> groupAnagrams(String[] words) {
        java.util.Map<String, java.util.List<String>> groups = new java.util.LinkedHashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            java.util.Arrays.sort(letters);
            groups.computeIfAbsent(new String(letters), ignored -> new java.util.ArrayList<>()).add(word);
        }
        return new java.util.ArrayList<>(groups.values());
    }

    @Override
    public String problem() {
        return "Group words that are anagrams of one another.";
    }

    @Override
    public String hint() {
        return "Use a sorted word or frequency vector as a map key.";
    }

    @Override
    public String targetComplexity() {
        return "O(n·k log k) time";
    }

    public static void main(String[] args) {
        new GroupAnagrams().printGuide();
    }
}
