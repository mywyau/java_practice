package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Find two lines that hold the most water.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ContainerWithMostWater implements DsaExercise {
    @Override
    public String problem() {
        return "Find two lines that hold the most water.";
    }

    @Override
    public String hint() {
        return "Move the pointer at the shorter line inward.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ContainerWithMostWater().printGuide();
    }
}

