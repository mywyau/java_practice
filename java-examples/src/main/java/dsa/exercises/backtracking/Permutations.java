package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Generate every ordering of distinct values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class Permutations implements DsaExercise {
    @Override
    public String problem() {
        return "Generate every ordering of distinct values.";
    }

    @Override
    public String hint() {
        return "Choose each unused value for the next position.";
    }

    @Override
    public String targetComplexity() {
        return "O(n·n!) time, O(n) recursion";
    }

    public static void main(String[] args) {
        new Permutations().printGuide();
    }
}

