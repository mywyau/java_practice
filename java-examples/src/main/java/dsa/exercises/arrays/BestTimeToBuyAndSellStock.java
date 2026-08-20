package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Find the maximum profit from one buy followed by one sale.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class BestTimeToBuyAndSellStock implements DsaExercise {
    @Override
    public String problem() {
        return "Find the maximum profit from one buy followed by one sale.";
    }

    @Override
    public String hint() {
        return "Track the lowest price seen and the best profit.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new BestTimeToBuyAndSellStock().printGuide();
    }
}

