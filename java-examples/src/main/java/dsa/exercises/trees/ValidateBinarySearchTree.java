package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Check that every node obeys BST ordering rules.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidateBinarySearchTree implements DsaExercise {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /** Validates every node against bounds inherited from all its ancestors. */
    public static boolean isValidBST(TreeNode root) {
        // long bounds leave room beyond Integer.MIN_VALUE and Integer.MAX_VALUE.
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.value <= lower || node.value >= upper) {
            return false;
        }

        // A left child must also obey the bounds inherited from higher ancestors.
        return valid(node.left, lower, node.value)
                && valid(node.right, node.value, upper);
    }

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
