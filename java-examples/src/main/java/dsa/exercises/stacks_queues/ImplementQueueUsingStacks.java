package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Implement FIFO operations using two LIFO stacks.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ImplementQueueUsingStacks implements DsaExercise {
    // Transfer lazily so each value moves from input to output only once.
    private final java.util.Deque<Integer> input = new java.util.ArrayDeque<>();
    private final java.util.Deque<Integer> output = new java.util.ArrayDeque<>();
    public void push(int value) { input.push(value); }
    public int pop() { moveIfNeeded(); return output.pop(); }
    public int peek() { moveIfNeeded(); return output.element(); }
    public boolean empty() { return input.isEmpty() && output.isEmpty(); }
    private void moveIfNeeded() { if (output.isEmpty()) while (!input.isEmpty()) output.push(input.pop()); }

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
