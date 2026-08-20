package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Reorder L0→L1→… as L0→Ln→L1→Ln-1→….
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReorderList implements DsaExercise {
    @Override
    public String problem() {
        return "Reorder L0→L1→… as L0→Ln→L1→Ln-1→….";
    }

    @Override
    public String hint() {
        return "Find the middle, reverse the second half, then weave.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ReorderList().printGuide();
    }
}

