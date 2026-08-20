package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Find the number of nodes on the longest root-to-leaf path.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MaximumDepthOfBinaryTree implements DsaExercise {
    @Override
    public String problem() {
        return "Find the number of nodes on the longest root-to-leaf path.";
    }

    @Override
    public String hint() {
        return "Return one plus the larger recursive subtree depth.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(h) space";
    }

    public static void main(String[] args) {
        new MaximumDepthOfBinaryTree().printGuide();
    }
}

