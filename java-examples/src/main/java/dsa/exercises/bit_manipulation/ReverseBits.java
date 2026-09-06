package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Reverse all 32 bits of an integer.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReverseBits implements DsaExercise {
    // Copy one low input bit at a time; unsigned shift fills from the left with zeroes.
    public static int reverseBits(int number) { int result = 0; for (int i = 0; i < Integer.SIZE; i++) { result = (result << 1) | (number & 1); number >>>= 1; } return result; }

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
