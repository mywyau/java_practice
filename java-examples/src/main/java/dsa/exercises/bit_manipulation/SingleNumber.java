package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Find the value appearing once when all others appear twice.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class SingleNumber implements DsaExercise {
    // Equal pairs cancel under XOR, leaving the unpaired value.
    public static int singleNumber(int[] numbers) { int answer = 0; for (int number : numbers) answer ^= number; return answer; }

    @Override
    public String problem() {
        return "Find the value appearing once when all others appear twice.";
    }

    @Override
    public String hint() {
        return "XOR cancels equal pairs and leaves the unique value.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new SingleNumber().printGuide();
    }
}
