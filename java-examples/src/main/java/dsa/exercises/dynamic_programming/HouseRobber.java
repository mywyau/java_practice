package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Maximize non-adjacent values selected from a row.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class HouseRobber implements DsaExercise {
    // Choose between skipping this house or adding it to the best total two houses back.
    public static int rob(int[] houses) { int twoBack = 0, oneBack = 0; for (int money : houses) { int best = Math.max(oneBack, twoBack + money); twoBack = oneBack; oneBack = best; } return oneBack; }

    @Override
    public String problem() {
        return "Maximize non-adjacent values selected from a row.";
    }

    @Override
    public String hint() {
        return "Track the best totals including or excluding each house.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new HouseRobber().printGuide();
    }
}
