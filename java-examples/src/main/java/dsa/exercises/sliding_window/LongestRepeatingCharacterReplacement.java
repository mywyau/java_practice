package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the longest window made uniform with at most k replacements.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LongestRepeatingCharacterReplacement implements DsaExercise {
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

