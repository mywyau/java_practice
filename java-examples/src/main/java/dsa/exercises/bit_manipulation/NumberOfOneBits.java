package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Count set bits in an integer.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class NumberOfOneBits implements DsaExercise {
    // n & (n - 1) clears exactly the lowest set bit on each iteration.
    public static int hammingWeight(int number) { int count = 0; while (number != 0) { number &= number - 1; count++; } return count; }

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
