package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Find the lowest node containing both targets in its subtrees.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LowestCommonAncestor implements DsaExercise {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /** Returns a found target upward until the two target paths meet. */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode first, TreeNode second) {
        if (root == null || root == first || root == second) {
            return root;
        }

        TreeNode leftResult = lowestCommonAncestor(root.left, first, second);
        TreeNode rightResult = lowestCommonAncestor(root.right, first, second);
        if (leftResult != null && rightResult != null) {
            return root; // One target was found on each side: this is their split point.
        }

        // Pass whichever target (or completed ancestor result) was found upward.
        return leftResult != null ? leftResult : rightResult;
    }

    @Override
    public String problem() {
        return "Find the lowest node containing both targets in its subtrees.";
    }

    @Override
    public String hint() {
        return "Return a target when found; combine non-null subtree results.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(h) space";
    }

    public static void main(String[] args) {
        new LowestCommonAncestor().printGuide();
    }
}
