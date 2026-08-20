package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Determine whether a linked list contains a cycle.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LinkedListCycle implements DsaExercise {
    @Override
    public String problem() {
        return "Determine whether a linked list contains a cycle.";
    }

    @Override
    public String hint() {
        return "Move one pointer once and another twice per step.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new LinkedListCycle().printGuide();
    }
}

