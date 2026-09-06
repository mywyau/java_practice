package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the shortest positive-number window meeting a target sum.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MinimumSizeSubarraySum implements DsaExercise {
    // Positive values make the sum monotonic as either boundary moves.
    public static int minSubArrayLen(int target, int[] numbers) { int left = 0, sum = 0, best = Integer.MAX_VALUE; for (int right = 0; right < numbers.length; right++) { sum += numbers[right]; while (sum >= target) { best = Math.min(best, right - left + 1); sum -= numbers[left++]; } } return best == Integer.MAX_VALUE ? 0 : best; }

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
