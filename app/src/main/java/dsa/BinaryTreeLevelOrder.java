package dsa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Given a tree:
//      3
//     / \
//    9  20
//       / \
//      15  7

// Return value:
// [
//   [3],
//   [9, 20],
//   [15, 7]
// ]

// 1. Edge case

//   If root == null, return an empty list.

// 2. Initialize

//   A Queue<TreeNode> to hold nodes of the current level.
//   A List<List<Integer>> result to build and return.

// 3. Loop while queue not empty

//   Record the current queue size n (nodes in this level).
//   Create a List<Integer> level = new ArrayList<>().
//   Repeat n times:
//   node = queue.poll()
//   level.add(node.val)
//   If node.left != null, queue.offer(node.left)
//   If node.right != null, queue.offer(node.right)
//   After the inner loop, level holds all values of one depth—add it to result.

// 4. Return result.

public class BinaryTreeLevelOrder {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    // Code for the traversal
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(level);
        }
        return result;
    }

    // --- example usage ---
    public static void main(String[] args) {
        /*
         * 3
         * / \
         * 9 20
         * / \
         * 15 7
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> levels = new BinaryTreeLevelOrder().levelOrder(root);
        System.out.println(levels);
        // prints: [[3], [9, 20], [15, 7]]
    }

}
