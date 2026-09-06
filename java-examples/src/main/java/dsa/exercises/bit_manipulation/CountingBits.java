package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Return set-bit counts for every number from 0 through n.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CountingBits implements DsaExercise {
    // Shifting drops the low bit, whose value is then added back with i & 1.
    public static int[] countBits(int n) { int[] counts = new int[n + 1]; for (int i = 1; i <= n; i++) counts[i] = counts[i >> 1] + (i & 1); return counts; }

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
