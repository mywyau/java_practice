package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Determine whether an array contains a repeated value.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ContainsDuplicate implements DsaExercise {
    @Override
    public String problem() {
        return "Determine whether an array contains a repeated value.";
    }

    @Override
    public String hint() {
        return "Insert values into a set and stop when insertion fails.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        new ContainsDuplicate().printGuide();
    }
}

