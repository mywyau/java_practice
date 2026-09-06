package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Find the fewest coins needed to make an amount.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CoinChange implements DsaExercise {
    // best[value] is built from already-solved best[value - coin] states.
    public static int coinChange(int[] coins, int amount) {
        int[] best = new int[amount + 1]; java.util.Arrays.fill(best, amount + 1); best[0] = 0;
        for (int value = 1; value <= amount; value++) for (int coin : coins) if (coin > 0 && coin <= value) best[value] = Math.min(best[value], best[value - coin] + 1);
        return best[amount] > amount ? -1 : best[amount];
    }

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
