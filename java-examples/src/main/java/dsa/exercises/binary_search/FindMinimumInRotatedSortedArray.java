package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find the minimum value in a rotated sorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class FindMinimumInRotatedSortedArray implements DsaExercise {
    @Override
    public String problem() {
        return "Find the minimum value in a rotated sorted array.";
    }

    @Override
    public String hint() {
        return "Compare the midpoint with the right boundary.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) time, O(1) space";
    }

    public static void main(String[] args) {
        new FindMinimumInRotatedSortedArray().printGuide();
    }
}

