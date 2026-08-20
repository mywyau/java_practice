package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Find a station from which a full circuit is possible.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class GasStation implements DsaExercise {
    @Override
    public String problem() {
        return "Find a station from which a full circuit is possible.";
    }

    @Override
    public String hint() {
        return "Reset the candidate after any prefix with negative fuel.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new GasStation().printGuide();
    }
}

