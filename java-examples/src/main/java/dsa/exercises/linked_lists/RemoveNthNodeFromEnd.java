package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Remove the nth node measured from the list's end.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class RemoveNthNodeFromEnd implements DsaExercise {
    @Override
    public String problem() {
        return "Remove the nth node measured from the list's end.";
    }

    @Override
    public String hint() {
        return "Keep two pointers n nodes apart.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new RemoveNthNodeFromEnd().printGuide();
    }
}

