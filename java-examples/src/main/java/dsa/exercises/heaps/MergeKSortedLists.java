package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Merge k already-sorted linked lists.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MergeKSortedLists implements DsaExercise {
    @Override
    public String problem() {
        return "Merge k already-sorted linked lists.";
    }

    @Override
    public String hint() {
        return "Keep each list's current smallest node in a min-heap.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log k) time, O(k) space";
    }

    public static void main(String[] args) {
        new MergeKSortedLists().printGuide();
    }
}

