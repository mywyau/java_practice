package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find a target's index in a sorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ClassicBinarySearch implements DsaExercise {
    // The target, if present, always remains inside the closed [left, right] range.
    public static int search(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) { int middle = left + (right - left) / 2; if (numbers[middle] == target) return middle; if (numbers[middle] < target) left = middle + 1; else right = middle - 1; }
        return -1;
    }

    @Override
    public String problem() {
        return "Find a target's index in a sorted array.";
    }

    @Override
    public String hint() {
        return "Discard half the remaining range after each comparison.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ClassicBinarySearch().printGuide();
    }
}
