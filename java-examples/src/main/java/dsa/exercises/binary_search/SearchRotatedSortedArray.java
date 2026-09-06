package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Search a sorted array that was rotated once.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class SearchRotatedSortedArray implements DsaExercise {
    // At least one half is normally sorted; use it to discard the impossible half.
    public static int search(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) return middle;
            if (numbers[left] <= numbers[middle]) {
                if (numbers[left] <= target && target < numbers[middle]) right = middle - 1; else left = middle + 1;
            } else if (numbers[middle] < target && target <= numbers[right]) left = middle + 1; else right = middle - 1;
        }
        return -1;
    }

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
