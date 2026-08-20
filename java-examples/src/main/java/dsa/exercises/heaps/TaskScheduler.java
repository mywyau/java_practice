package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Find minimum slots needed with a cooldown between equal tasks.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class TaskScheduler implements DsaExercise {
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

