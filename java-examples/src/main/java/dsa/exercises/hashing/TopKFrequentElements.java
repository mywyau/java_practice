package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Return the k most frequent values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class TopKFrequentElements implements DsaExercise {
    @Override
    public String problem() {
        return "Return the k most frequent values.";
    }

    @Override
    public String hint() {
        return "Count values, then use buckets or a heap.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) bucket time, O(n) space";
    }

    public static void main(String[] args) {
        new TopKFrequentElements().printGuide();
    }
}

