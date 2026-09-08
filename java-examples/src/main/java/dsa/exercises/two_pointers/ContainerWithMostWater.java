package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Find two lines that hold the most water.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */


public class ContainerWithMostWater implements DsaExercise {
    // Width always shrinks, so only moving the shorter wall might improve the area.
    public static int maxArea(int[] heights) {

        // left pointer
        int left = 0;

        // right pointer
        int right = heights.length - 1;
        int best = 0;

        while (left < right) {
            best = Math.max(best, Math.min(heights[left], heights[right]) * (right - left));
            if (heights[left] < heights[right])
                // move left pointer
                left++;
            else
                // move right pointer
                right--;
        }
        return best;
    }

    @Override
    public String problem() {
        return "Find two lines that hold the most water.";
    }

    @Override
    public String hint() {
        return "Move the pointer at the shorter line inward.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ContainerWithMostWater().printGuide();
    }
}
