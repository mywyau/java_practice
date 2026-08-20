package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;

/**
 * Return products of all other elements without division.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ProductOfArrayExceptSelf implements DsaExercise {
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
        new ProductOfArrayExceptSelf().printGuide();
    }
}

