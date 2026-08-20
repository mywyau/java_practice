package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Reverse a singly linked list in place.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReverseLinkedList implements DsaExercise {
    @Override
    public String problem() {
        return "Reverse a singly linked list in place.";
    }

    @Override
    public String hint() {
        return "Track previous, current, and next nodes.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ReverseLinkedList().printGuide();
    }
}

