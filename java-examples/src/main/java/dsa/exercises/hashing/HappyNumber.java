package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Detect whether repeatedly summing squared digits reaches one.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class HappyNumber implements DsaExercise {
    @Override
    public String problem() {
        return "Detect whether repeatedly summing squared digits reaches one.";
    }

    @Override
    public String hint() {
        return "Use a set or Floyd's cycle detection.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) work per step";
    }

    public static void main(String[] args) {
        new HappyNumber().printGuide();
    }
}

