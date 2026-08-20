package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Return set-bit counts for every number from 0 through n.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CountingBits implements DsaExercise {
    @Override
    public String problem() {
        return "Return set-bit counts for every number from 0 through n.";
    }

    @Override
    public String hint() {
        return "Reuse the answer for i shifted right by one.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        new CountingBits().printGuide();
    }
}

