package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Find unique triplets whose sum is zero.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ThreeSum implements DsaExercise {
    // Sorting lets two inner pointers move according to whether their sum is low or
    // high.
    public static java.util.List<java.util.List<Integer>> threeSum(int[] numbers) {
        int[] sorted = numbers.clone();
        java.util.Arrays.sort(sorted);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        for (int i = 0; i < sorted.length - 2; i++) {
            if (i > 0 && sorted[i] == sorted[i - 1])
                continue;
            int left = i + 1, right = sorted.length - 1;
            while (left < right) {
                int sum = sorted[i] + sorted[left] + sorted[right];
                if (sum < 0)
                    left++;
                else if (sum > 0)
                    right--;
                else {
                    result.add(java.util.List.of(sorted[i], sorted[left++], sorted[right--]));
                    while (left < right && sorted[left] == sorted[left - 1])
                        left++;
                    while (left < right && sorted[right] == sorted[right + 1])
                        right--;
                }
            }
        }
        return result;
    }

    @Override
    public String problem() {
        return "Find unique triplets whose sum is zero.";
    }

    @Override
    public String hint() {
        return "Sort, fix one value, then move left and right pointers.";
    }

    @Override
    public String targetComplexity() {
        return "O(n²) time, O(1) extra space";
    }

    public static void main(String[] args) {
        new ThreeSum().printGuide();
    }
}
