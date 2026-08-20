package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Count ways to climb n steps using jumps of one or two.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ClimbingStairs implements DsaExercise {
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

