package dsa.exercises.trees;

import dsa.exercises.DsaExercise;

/**
 * Find the lowest node containing both targets in its subtrees.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LowestCommonAncestor implements DsaExercise {
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

