package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Implement FIFO operations using two LIFO stacks.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ImplementQueueUsingStacks implements DsaExercise {
    @Override
    public String problem() {
        return "Implement FIFO operations using two LIFO stacks.";
    }

    @Override
    public String hint() {
        return "Move elements to an output stack only when it is empty.";
    }

    @Override
    public String targetComplexity() {
        return "Amortized O(1) per operation";
    }

    public static void main(String[] args) {
        new ImplementQueueUsingStacks().printGuide();
    }
}

