package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Check that every node obeys BST ordering rules.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidateBinarySearchTree implements DsaExercise {
    @Override
    public String problem() {
        return "Check that every node obeys BST ordering rules.";
    }

    @Override
    public String hint() {
        return "Carry exclusive lower and upper bounds down the tree.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(h) space";
    }

    public static void main(String[] args) {
        new ValidateBinarySearchTree().printGuide();
    }
}

