package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Determine whether prerequisite edges contain a cycle.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CourseSchedule implements DsaExercise {
    // Removing zero-indegree nodes is possible for every node exactly when no cycle exists.
    public static boolean canFinish(int courseCount, int[][] prerequisites) { java.util.List<java.util.List<Integer>> graph = new java.util.ArrayList<>(); for (int i = 0; i < courseCount; i++) graph.add(new java.util.ArrayList<>()); int[] indegrees = new int[courseCount]; for (int[] edge : prerequisites) { graph.get(edge[1]).add(edge[0]); indegrees[edge[0]]++; } java.util.Queue<Integer> ready = new java.util.ArrayDeque<>(); for (int i = 0; i < courseCount; i++) if (indegrees[i] == 0) ready.add(i); int completed = 0; while (!ready.isEmpty()) { int course = ready.remove(); completed++; for (int next : graph.get(course)) if (--indegrees[next] == 0) ready.add(next); } return completed == courseCount; }

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
