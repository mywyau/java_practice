package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Find the shortest one-letter transformation sequence.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class WordLadder implements DsaExercise {
    @Override
    public String problem() {
        return "Find the shortest one-letter transformation sequence.";
    }

    @Override
    public String hint() {
        return "BFS through valid wildcard or generated neighbors.";
    }

    @Override
    public String targetComplexity() {
        return "O(words·wordLength²) time";
    }

    public static void main(String[] args) {
        new WordLadder().printGuide();
    }
}

