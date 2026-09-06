package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Find the missing value from the range 0 through n.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MissingNumber implements DsaExercise {
    // Matching indexes and values cancel, so only the missing range value survives.
    public static int missingNumber(int[] numbers) { int answer = numbers.length; for (int i = 0; i < numbers.length; i++) answer ^= i ^ numbers[i]; return answer; }

    @Override
    public String problem() {
        return "Find the missing value from the range 0 through n.";
    }

    @Override
    public String hint() {
        return "XOR all indexes and values, or compare expected and actual sums.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new MissingNumber().printGuide();
    }
}
