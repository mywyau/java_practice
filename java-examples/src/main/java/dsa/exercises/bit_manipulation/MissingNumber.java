package dsa.exercises.bit_manipulation;

import dsa.exercises.DsaExercise;

/**
 * Find the missing value from the range 0 through n.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MissingNumber implements DsaExercise {
    /** Cancels every matching index/value pair, leaving the missing value. */
    public static int missingNumber(int[] numbers) {
        // The indexes cover 0..n-1, so include n separately to complete 0..n.
        int answer = numbers.length;
        for (int index = 0; index < numbers.length; index++) {
            answer ^= index;
            answer ^= numbers[index];
        }
        return answer;
    }

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
