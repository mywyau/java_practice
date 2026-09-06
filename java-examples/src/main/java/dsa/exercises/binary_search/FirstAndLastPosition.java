package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find the first and last index of a repeated target.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class FirstAndLastPosition implements DsaExercise {
    // Find insertion boundaries rather than stopping at an arbitrary matching index.
    public static int[] searchRange(int[] numbers, int target) {
        int start = boundary(numbers, target, true);
        return start == numbers.length || numbers[start] != target ? new int[] {-1, -1} : new int[] {start, boundary(numbers, target, false) - 1};
    }

    private static int boundary(int[] numbers, int target, boolean first) {
        int left = 0, right = numbers.length;
        while (left < right) { int middle = left + (right - left) / 2; if (numbers[middle] > target || first && numbers[middle] == target) right = middle; else left = middle + 1; }
        return left;
    }

    @Override
    public String problem() {
        return "Find the first and last index of a repeated target.";
    }

    @Override
    public String hint() {
        return "Run boundary-focused binary search twice.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) time, O(1) space";
    }

    public static void main(String[] args) {
        new FirstAndLastPosition().printGuide();
    }
}
