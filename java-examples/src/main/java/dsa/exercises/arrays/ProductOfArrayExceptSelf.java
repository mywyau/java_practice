package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Return products of all other elements without division.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ProductOfArrayExceptSelf implements DsaExercise {
    /**
     * Builds prefix products from left to right, then multiplies them by suffix
     * products while moving right to left. The result array is not counted as
     * extra space, so only the two running products use additional memory.
     */
    public static int[] productExceptSelf(int[] numbers) {
        int[] products = new int[numbers.length];
        int prefix = 1;

        for (int index = 0; index < numbers.length; index++) {
            products[index] = prefix;
            prefix *= numbers[index];
        }

        int suffix = 1;
        for (int index = numbers.length - 1; index >= 0; index--) {
            products[index] *= suffix;
            suffix *= numbers[index];
        }

        return products;
    }

    @Override
    public String problem() {
        return "Return products of all other elements without division.";
    }

    @Override
    public String hint() {
        return "Combine prefix products with suffix products.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) extra space";
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf exercise = new ProductOfArrayExceptSelf();
        exercise.printGuide();
        System.out.println("Example: " + java.util.Arrays.toString(productExceptSelf(new int[] {1, 2, 3, 4})));
    }
}
