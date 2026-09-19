package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Count ways to climb n steps using jumps of one or two.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ClimbingStairs implements DsaExercise {
    /** Uses the Fibonacci-like rule: ways(n) = ways(n - 1) + ways(n - 2). */
    public static int climbStairs(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int twoStepsBack = 1; // There is one way to reach step 0: take no steps.
        int oneStepBack = 1;  // There is one way to reach step 1.
        for (int step = 2; step <= n; step++) {
            int waysToCurrent = twoStepsBack + oneStepBack;
            twoStepsBack = oneStepBack; // Roll the two DP states forward.
            oneStepBack = waysToCurrent;
        }
        return oneStepBack;
    }

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
