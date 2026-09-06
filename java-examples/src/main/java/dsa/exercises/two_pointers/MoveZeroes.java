package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Move all zeroes to the end while preserving other values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MoveZeroes implements DsaExercise {
    // First compact nonzero values in order, then clear the unused suffix.
    public static void moveZeroes(int[] numbers) { int write = 0; for (int number : numbers) if (number != 0) numbers[write++] = number; while (write < numbers.length) numbers[write++] = 0; }

    @Override
    public String problem() {
        return "Move all zeroes to the end while preserving other values.";
    }

    @Override
    public String hint() {
        return "Compact nonzero values, then fill the remainder with zeroes.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new MoveZeroes().printGuide();
    }
}
