package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Find the number of nodes on the longest root-to-leaf path.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MaximumDepthOfBinaryTree implements DsaExercise {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /** Returns the number of nodes on the longest path starting at {@code root}. */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // An empty subtree contributes no nodes to the path.
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth); // Add the current node.
    }

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
