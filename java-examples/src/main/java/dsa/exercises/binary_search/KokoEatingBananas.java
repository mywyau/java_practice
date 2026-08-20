package dsa.exercises.binary_search;

import dsa.exercises.DsaExercise;

/**
 * Find the smallest integer speed that meets a time limit.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class KokoEatingBananas implements DsaExercise {
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

