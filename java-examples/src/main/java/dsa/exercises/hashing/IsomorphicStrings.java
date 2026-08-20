package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Check whether characters in two strings map one-to-one.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class IsomorphicStrings implements DsaExercise {
    @Override
    public String problem() {
        return "Check whether characters in two strings map one-to-one.";
    }

    @Override
    public String hint() {
        return "Maintain mappings in both directions.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new IsomorphicStrings().printGuide();
    }
}

