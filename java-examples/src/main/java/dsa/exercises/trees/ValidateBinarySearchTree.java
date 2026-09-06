package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Check that every node obeys BST ordering rules.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidateBinarySearchTree implements DsaExercise {
    // Ancestor bounds catch deep violations that parent-only comparisons miss.
    public static class TreeNode { public int value; public TreeNode left, right; public TreeNode(int value) { this.value = value; } }
    public static boolean isValidBST(TreeNode root) { return valid(root, Long.MIN_VALUE, Long.MAX_VALUE); }
    private static boolean valid(TreeNode node, long lower, long upper) { return node == null || node.value > lower && node.value < upper && valid(node.left, lower, node.value) && valid(node.right, node.value, upper); }

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
