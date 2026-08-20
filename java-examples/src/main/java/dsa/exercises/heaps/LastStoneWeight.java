package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Repeatedly smash the two heaviest stones.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LastStoneWeight implements DsaExercise {
    @Override
    public String problem() {
        return "Repeatedly smash the two heaviest stones.";
    }

    @Override
    public String hint() {
        return "Use a max-heap to retrieve the heaviest pair.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(n) space";
    }

    public static void main(String[] args) {
        new LastStoneWeight().printGuide();
    }
}

