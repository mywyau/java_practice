package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Find the kth largest value in an unsorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class KthLargestElement implements DsaExercise {
    @Override
    public String problem() {
        return "Find the kth largest value in an unsorted array.";
    }

    @Override
    public String hint() {
        return "Maintain a min-heap containing only the largest k values.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log k) time, O(k) space";
    }

    public static void main(String[] args) {
        new KthLargestElement().printGuide();
    }
}

