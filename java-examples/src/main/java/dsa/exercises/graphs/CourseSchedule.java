package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Determine whether prerequisite edges contain a cycle.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CourseSchedule implements DsaExercise {
    @Override
    public String problem() {
        return "Determine whether prerequisite edges contain a cycle.";
    }

    @Override
    public String hint() {
        return "Use indegrees for topological sort or DFS visit states.";
    }

    @Override
    public String targetComplexity() {
        return "O(V+E) time, O(V) space";
    }

    public static void main(String[] args) {
        new CourseSchedule().printGuide();
    }
}

