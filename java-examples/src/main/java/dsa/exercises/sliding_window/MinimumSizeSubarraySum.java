package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the shortest positive-number window meeting a target sum.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinimumSizeSubarraySum implements DsaExercise {
    /** Expands the right edge, then shrinks valid windows from the left. */
    public static int minSubArrayLen(int target, int[] numbers) {
        int left = 0;
        int windowSum = 0;
        int shortest = Integer.MAX_VALUE; // Sentinel meaning “no valid window yet.”

        for (int right = 0; right < numbers.length; right++) {
            windowSum += numbers[right];
            while (windowSum >= target) {
                shortest = Math.min(shortest, right - left + 1);
                windowSum -= numbers[left];
                left++; // Shrink and see whether the smaller window remains valid.
            }
        }
        return shortest == Integer.MAX_VALUE ? 0 : shortest;
    }

    @Override
    public String problem() {
        return "Find the shortest positive-number window meeting a target sum.";
    }

    @Override
    public String hint() {
        return "Expand right and shrink left while the sum is large enough.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new MinimumSizeSubarraySum().printGuide();
    }
}
