package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Count set bits in an integer.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class NumberOfOneBits implements DsaExercise {
    @Override
    public String problem() {
        return "Count set bits in an integer.";
    }

    @Override
    public String hint() {
        return "Repeatedly clear the lowest set bit with n & (n-1).";
    }

    @Override
    public String targetComplexity() {
        return "O(number of set bits)";
    }

    public static void main(String[] args) {
        new NumberOfOneBits().printGuide();
    }
}

