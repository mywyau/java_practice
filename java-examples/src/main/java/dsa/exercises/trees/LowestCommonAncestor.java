package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Find the lowest node containing both targets in its subtrees.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LowestCommonAncestor implements DsaExercise {
    // Non-null discoveries from both subtrees make the current node the split point.
    public static class TreeNode { public int value; public TreeNode left, right; public TreeNode(int value) { this.value = value; } }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode first, TreeNode second) { if (root == null || root == first || root == second) return root; TreeNode left = lowestCommonAncestor(root.left, first, second), right = lowestCommonAncestor(root.right, first, second); return left != null && right != null ? root : left != null ? left : right; }

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
