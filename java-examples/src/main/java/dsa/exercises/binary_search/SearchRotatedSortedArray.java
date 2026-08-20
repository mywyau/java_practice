package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Search a sorted array that was rotated once.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class SearchRotatedSortedArray implements DsaExercise {
    @Override
    public String problem() {
        return "Search a sorted array that was rotated once.";
    }

    @Override
    public String hint() {
        return "At each step determine which half remains sorted.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) time, O(1) space";
    }

    public static void main(String[] args) {
        new SearchRotatedSortedArray().printGuide();
    }
}

