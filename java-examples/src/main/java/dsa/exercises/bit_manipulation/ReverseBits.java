package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Reverse all 32 bits of an integer.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReverseBits implements DsaExercise {
    @Override
    public String problem() {
        return "Reverse all 32 bits of an integer.";
    }

    @Override
    public String hint() {
        return "Shift the result and copy one low input bit per step.";
    }

    @Override
    public String targetComplexity() {
        return "O(1) time for 32 bits";
    }

    public static void main(String[] args) {
        new ReverseBits().printGuide();
    }
}

