package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Move all zeroes to the end while preserving other values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().

   This method moves all non-zero numbers to the beginning of the array,
   preserving their order, and fills the remaining positions with zeroes.

   The algorithm takes O(n) time and uses O(1) extra space.

   The technique is often called a read/write pointer pattern:
   - number represents the value currently being read.
   - write represents where the next retained value should be written.
   - Everything before write is already correct.
 */

public class MoveZeroes implements DsaExercise {
    // First compact nonzero values in order, then clear the unused suffix.
    public static void moveZeroes(int[] numbers) {
        int write = 0;
        for (int number : numbers)
            if (number != 0)
                numbers[write++] = number;
        while (write < numbers.length)
            numbers[write++] = 0;
    }

    public static void moveZeroes2(int[] numbers) {
        // Index where the next non-zero number should be written.
        int write = 0;

        // First pass: copy all non-zero numbers to the front.
        for (int number : numbers) {
            if (number != 0) {
                numbers[write] = number;
                write++;
            }
        }

        // Second pass: fill the remaining positions with zeroes.
        while (write < numbers.length) {
            numbers[write] = 0;
            write++;
        }
    }

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
