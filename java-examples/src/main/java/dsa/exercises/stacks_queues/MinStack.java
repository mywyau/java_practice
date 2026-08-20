package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Design a stack supporting constant-time minimum lookup.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinStack implements DsaExercise {
    @Override
    public String problem() {
        return "Design a stack supporting constant-time minimum lookup.";
    }

    @Override
    public String hint() {
        return "Store each value alongside the minimum at that depth.";
    }

    @Override
    public String targetComplexity() {
        return "O(1) per operation";
    }

    public static void main(String[] args) {
        new MinStack().printGuide();
    }
}

