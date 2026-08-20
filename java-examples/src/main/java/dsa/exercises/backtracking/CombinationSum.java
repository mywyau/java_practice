package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Find combinations that sum to a target with reusable values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CombinationSum implements DsaExercise {
    @Override
    public String problem() {
        return "Find combinations that sum to a target with reusable values.";
    }

    @Override
    public String hint() {
        return "Backtrack using a start index to avoid reordered duplicates.";
    }

    @Override
    public String targetComplexity() {
        return "Exponential time, O(target) depth";
    }

    public static void main(String[] args) {
        new CombinationSum().printGuide();
    }
}

