package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Find unique triplets whose sum is zero.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ThreeSum implements DsaExercise {
    @Override
    public String problem() {
        return "Find unique triplets whose sum is zero.";
    }

    @Override
    public String hint() {
        return "Sort, fix one value, then move left and right pointers.";
    }

    @Override
    public String targetComplexity() {
        return "O(n²) time, O(1) extra space";
    }

    public static void main(String[] args) {
        new ThreeSum().printGuide();
    }
}

