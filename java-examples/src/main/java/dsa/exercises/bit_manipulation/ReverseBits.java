package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Reverse all 32 bits of an integer.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReverseBits implements DsaExercise {
    /** Reverses all 32 positions, including leading and trailing zero bits. */
    public static int reverseBits(int number) {
        int result = 0;
        for (int bit = 0; bit < Integer.SIZE; bit++) {
            // Make room, then copy the input's lowest bit into the result.
            result = (result << 1) | (number & 1);
            // >>> is an unsigned shift: it always inserts a zero on the left.
            number >>>= 1;
        }
        return result;
    }

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
