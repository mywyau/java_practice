package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Decide whether a string can be segmented into dictionary words.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class WordBreak implements DsaExercise {
    @Override
    public String problem() {
        return "Decide whether a string can be segmented into dictionary words.";
    }

    @Override
    public String hint() {
        return "Mark each reachable prefix using earlier reachable positions.";
    }

    @Override
    public String targetComplexity() {
        return "O(n²) time, O(n) space";
    }

    public static void main(String[] args) {
        new WordBreak().printGuide();
    }
}

