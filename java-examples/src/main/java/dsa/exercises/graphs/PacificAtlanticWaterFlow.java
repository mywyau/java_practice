package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Find cells that can reach both ocean boundaries.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class PacificAtlanticWaterFlow implements DsaExercise {
    @Override
    public String problem() {
        return "Find cells that can reach both ocean boundaries.";
    }

    @Override
    public String hint() {
        return "Search backward from each ocean into non-decreasing heights.";
    }

    @Override
    public String targetComplexity() {
        return "O(rows·cols) time and space";
    }

    public static void main(String[] args) {
        new PacificAtlanticWaterFlow().printGuide();
    }
}

