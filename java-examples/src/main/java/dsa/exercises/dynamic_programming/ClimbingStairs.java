package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Count ways to climb n steps using jumps of one or two.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ClimbingStairs implements DsaExercise {
    // Each step can be reached from exactly the previous one or previous two steps.
    public static int climbStairs(int n) { if (n < 0) throw new IllegalArgumentException("n must be non-negative"); int previous = 1, current = 1; for (int step = 2; step <= n; step++) { int next = previous + current; previous = current; current = next; } return current; }

    @Override
    public String problem() {
        return "Count ways to climb n steps using jumps of one or two.";
    }

    @Override
    public String hint() {
        return "Each answer is the sum of the previous two.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ClimbingStairs().printGuide();
    }
}
