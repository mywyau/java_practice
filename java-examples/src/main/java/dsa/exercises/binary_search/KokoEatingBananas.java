package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find the smallest integer speed that meets a time limit.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class KokoEatingBananas implements DsaExercise {
    // Feasibility is monotonic: if one speed works, every faster speed also works.
    public static int minEatingSpeed(int[] piles, int hours) {
        if (piles.length == 0 || hours < piles.length) throw new IllegalArgumentException("hours must cover every pile");
        int left = 1, right = java.util.Arrays.stream(piles).max().orElseThrow();
        while (left < right) {
            int speed = left + (right - left) / 2; long needed = 0;
            for (int pile : piles) needed += (pile + (long) speed - 1) / speed;
            if (needed <= hours) right = speed; else left = speed + 1;
        }
        return left;
    }

    @Override
    public String problem() {
        return "Find the smallest integer speed that meets a time limit.";
    }

    @Override
    public String hint() {
        return "Binary-search the answer and test each candidate speed.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log m) time, O(1) space";
    }

    public static void main(String[] args) {
        new KokoEatingBananas().printGuide();
    }
}
