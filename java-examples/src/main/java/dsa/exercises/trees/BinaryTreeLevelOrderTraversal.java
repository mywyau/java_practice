package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Return node values one level at a time.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class BinaryTreeLevelOrderTraversal implements DsaExercise {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /** Uses breadth-first search to collect values one level at a time. */
    public static java.util.List<java.util.List<Integer>> levelOrder(TreeNode root) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        if (root == null) {
            return result;
        }

        java.util.Queue<TreeNode> queue = new java.util.ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // Capture size now: children added below belong to the next level.
            int levelSize = queue.size();
            java.util.List<Integer> level = new java.util.ArrayList<>(levelSize);
            for (int index = 0; index < levelSize; index++) {
                TreeNode node = queue.remove();
                level.add(node.value);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }

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
