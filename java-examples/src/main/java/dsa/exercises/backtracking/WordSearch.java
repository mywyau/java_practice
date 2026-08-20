package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Determine whether a word can be traced through adjacent grid cells.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class WordSearch implements DsaExercise {
    @Override
    public String problem() {
        return "Determine whether a word can be traced through adjacent grid cells.";
    }

    @Override
    public String hint() {
        return "DFS while temporarily marking cells as visited.";
    }

    @Override
    public String targetComplexity() {
        return "O(rows·cols·4^wordLength) time";
    }

    public static void main(String[] args) {
        new WordSearch().printGuide();
    }
}

