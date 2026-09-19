package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Swap every node's left and right subtrees.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class InvertBinaryTree implements DsaExercise {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /** Inverts the subtree in place and returns its unchanged root reference. */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Save one child before replacing it, otherwise its original reference is lost.
        TreeNode originalLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(originalLeft);
        return root;
    }

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
