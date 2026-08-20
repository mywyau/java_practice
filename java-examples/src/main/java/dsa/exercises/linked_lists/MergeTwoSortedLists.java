package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Merge two sorted linked lists.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MergeTwoSortedLists implements DsaExercise {
    @Override
    public String problem() {
        return "Merge two sorted linked lists.";
    }

    @Override
    public String hint() {
        return "Attach the smaller current node to a dummy-headed result.";
    }

    @Override
    public String targetComplexity() {
        return "O(n+m) time, O(1) space";
    }

    public static void main(String[] args) {
        new MergeTwoSortedLists().printGuide();
    }
}

