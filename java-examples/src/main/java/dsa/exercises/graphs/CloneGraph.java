package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Create a deep copy of a connected graph.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CloneGraph implements DsaExercise {
    @Override
    public String problem() {
        return "Create a deep copy of a connected graph.";
    }

    @Override
    public String hint() {
        return "Map each original node to its clone during DFS or BFS.";
    }

    @Override
    public String targetComplexity() {
        return "O(V+E) time, O(V) space";
    }

    public static void main(String[] args) {
        new CloneGraph().printGuide();
    }
}

