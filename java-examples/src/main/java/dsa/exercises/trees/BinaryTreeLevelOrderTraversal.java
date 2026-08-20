package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Return node values one level at a time.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class BinaryTreeLevelOrderTraversal implements DsaExercise {
    @Override
    public String problem() {
        return "Return node values one level at a time.";
    }

    @Override
    public String hint() {
        return "Use a queue and process its current size as one level.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(w) space";
    }

    public static void main(String[] args) {
        new BinaryTreeLevelOrderTraversal().printGuide();
    }
}

