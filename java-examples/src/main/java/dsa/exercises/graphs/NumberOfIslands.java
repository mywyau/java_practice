package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Count connected land regions in a grid.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class NumberOfIslands implements DsaExercise {
    @Override
    public String problem() {
        return "Count connected land regions in a grid.";
    }

    @Override
    public String hint() {
        return "Start DFS or BFS at each unvisited land cell.";
    }

    @Override
    public String targetComplexity() {
        return "O(rows·cols) time and space";
    }

    public static void main(String[] args) {
        new NumberOfIslands().printGuide();
    }
}

