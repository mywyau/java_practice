package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Generate the power set of distinct values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class Subsets implements DsaExercise {
    @Override
    public String problem() {
        return "Generate the power set of distinct values.";
    }

    @Override
    public String hint() {
        return "At each index choose whether to include the value.";
    }

    @Override
    public String targetComplexity() {
        return "O(n·2ⁿ) time, O(n) recursion";
    }

    public static void main(String[] args) {
        new Subsets().printGuide();
    }
}

