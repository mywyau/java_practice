package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Maximize non-adjacent values selected from a row.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class HouseRobber implements DsaExercise {
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

