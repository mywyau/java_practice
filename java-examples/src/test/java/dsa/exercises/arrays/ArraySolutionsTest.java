package dsa.exercises.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArraySolutionsTest {
    @Test
    void twoSumFindsPairAndDoesNotReuseOneElement() {
        assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[] {3, 3}, 6));
    }

    @Test
    void twoSumExplainsWhenThereIsNoSolution() {
        assertThrows(IllegalArgumentException.class,
                () -> TwoSum.twoSum(new int[] {1, 2, 3}, 20));
    }

    @Test
    void stockProfitCoversProfitLossAndEmptyInput() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[] {7, 6, 4, 3, 1}));
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[0]));
    }

    @Test
    void maximumSubarrayHandlesMixedAndAllNegativeValues() {
        assertEquals(6, MaximumSubarray.maxSubArray(
                new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(-2, MaximumSubarray.maxSubArray(new int[] {-3, -2, -5}));
        assertThrows(IllegalArgumentException.class, () -> MaximumSubarray.maxSubArray(new int[0]));
    }

    @Test
    void productExceptSelfHandlesOrdinaryValuesAndZeroes() {
        assertArrayEquals(new int[] {24, 12, 8, 6},
                ProductOfArrayExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4}));
        assertArrayEquals(new int[] {0, 0, 8, 0},
                ProductOfArrayExceptSelf.productExceptSelf(new int[] {1, 2, 0, 4}));
        assertArrayEquals(new int[] {0, 0, 0},
                ProductOfArrayExceptSelf.productExceptSelf(new int[] {0, 2, 0}));
    }

    @Test
    void mergeIntervalsCombinesOverlapWithoutChangingInput() {
        int[][] input = {{8, 10}, {1, 3}, {2, 6}, {15, 18}};

        assertArrayEquals(new int[][] {{1, 6}, {8, 10}, {15, 18}},
                MergeIntervals.merge(input));
        assertArrayEquals(new int[][] {{8, 10}, {1, 3}, {2, 6}, {15, 18}}, input);
    }

    @Test
    void mergeIntervalsHandlesTouchingAndEmptyIntervals() {
        assertArrayEquals(new int[][] {{1, 5}},
                MergeIntervals.merge(new int[][] {{1, 4}, {4, 5}}));
        assertArrayEquals(new int[0][], MergeIntervals.merge(new int[0][]));
    }
}
