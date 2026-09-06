package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Design a stack supporting constant-time minimum lookup.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinStack implements DsaExercise {
    // Store the minimum at every depth so pop restores the previous minimum for free.
    private final java.util.Deque<Integer> values = new java.util.ArrayDeque<>();
    private final java.util.Deque<Integer> minimums = new java.util.ArrayDeque<>();

    public void push(int value) { values.push(value); minimums.push(minimums.isEmpty() ? value : Math.min(value, minimums.peek())); }
    public int pop() { requireValue(); minimums.pop(); return values.pop(); }
    public int top() { requireValue(); return values.peek(); }
    public int getMin() { requireValue(); return minimums.peek(); }
    private void requireValue() { if (values.isEmpty()) throw new java.util.NoSuchElementException("stack is empty"); }

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
