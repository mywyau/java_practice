package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Remove duplicates in place and return the new length.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class RemoveDuplicatesFromSortedArray implements DsaExercise {
    @Override
    public String problem() {
        return "Remove duplicates in place and return the new length.";
    }

    @Override
    public String hint() {
        return "Use a read pointer and a slower write pointer.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArray().printGuide();
    }
}

