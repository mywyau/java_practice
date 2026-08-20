package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Find the fewest coins needed to make an amount.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CoinChange implements DsaExercise {
    @Override
    public String problem() {
        return "Find the fewest coins needed to make an amount.";
    }

    @Override
    public String hint() {
        return "Build best answers from zero up to the target.";
    }

    @Override
    public String targetComplexity() {
        return "O(amount·coins) time, O(amount) space";
    }

    public static void main(String[] args) {
        new CoinChange().printGuide();
    }
}

