package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find the minimum value in a rotated sorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class FindMinimumInRotatedSortedArray implements DsaExercise {
    // Comparing with the right edge reveals which side contains the rotation point.
    public static int findMin(int[] numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("numbers must not be empty");
        int left = 0, right = numbers.length - 1;
        while (left < right) { int middle = left + (right - left) / 2; if (numbers[middle] > numbers[right]) left = middle + 1; else right = middle; }
        return numbers[left];
    }

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
