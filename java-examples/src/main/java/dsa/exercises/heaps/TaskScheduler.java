package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Find minimum slots needed with a cooldown between equal tasks.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class TaskScheduler implements DsaExercise {
    // The most frequent tasks form a frame whose gaps can be filled by other tasks.
    public static int leastInterval(char[] tasks, int cooldown) { if (tasks.length == 0) return 0; java.util.Map<Character, Integer> counts = new java.util.HashMap<>(); int maximum = 0, maximumCount = 0; for (char task : tasks) { int count = counts.merge(task, 1, Integer::sum); if (count > maximum) { maximum = count; maximumCount = 1; } else if (count == maximum) maximumCount++; } return Math.max(tasks.length, (maximum - 1) * (cooldown + 1) + maximumCount); }

    @Override
    public String problem() {
        return "Find minimum slots needed with a cooldown between equal tasks.";
    }

    @Override
    public String hint() {
        return "Reason from the maximum frequency or simulate with heaps.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time with fixed alphabet";
    }

    public static void main(String[] args) {
        new TaskScheduler().printGuide();
    }
}
