package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Swap every node's left and right subtrees.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class InvertBinaryTree implements DsaExercise {
    @Override
    public String problem() {
        return "Swap every node's left and right subtrees.";
    }

    @Override
    public String hint() {
        return "Swap children, then recurse or traverse iteratively.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(h) space";
    }

    public static void main(String[] args) {
        new InvertBinaryTree().printGuide();
    }
}

