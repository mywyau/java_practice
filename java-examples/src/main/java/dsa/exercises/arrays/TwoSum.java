package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Find two indices whose values add to a target.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class TwoSum implements DsaExercise {
    @Override
    public String problem() {
        return "Find two indices whose values add to a target.";
    }

    @Override
    public String hint() {
        return "Use a map from value to index while scanning once.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        new TwoSum().printGuide();
    }
}

