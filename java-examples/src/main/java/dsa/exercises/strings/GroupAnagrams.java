package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Group words that are anagrams of one another.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class GroupAnagrams implements DsaExercise {
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

