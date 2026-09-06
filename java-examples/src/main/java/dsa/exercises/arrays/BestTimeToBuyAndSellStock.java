package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Find the maximum profit from one buy followed by one sale.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class BestTimeToBuyAndSellStock implements DsaExercise {
    /**
     * Finds the best profit when buying before selling. A falling market returns zero.
     * The cheapest earlier price is all we need in order to price today's sale.
     */
    public static int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int bestProfit = 0;

        for (int price : prices) {
            lowestPrice = Math.min(lowestPrice, price);
            bestProfit = Math.max(bestProfit, price - lowestPrice);
        }

        return bestProfit;
    }

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
        BestTimeToBuyAndSellStock exercise = new BestTimeToBuyAndSellStock();
        exercise.printGuide();
        System.out.println("Example: " + maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }
}
