package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Find the longest run of consecutive integers in any order.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestConsecutiveSequence implements DsaExercise {
    @Override
    public String problem() {
        return "Find the longest run of consecutive integers in any order.";
    }

    @Override
    public String hint() {
        return "Only grow sequences from numbers with no predecessor.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) expected time, O(n) space";
    }

    public static void main(String[] args) {
        new LongestConsecutiveSequence().printGuide();
    }
}

