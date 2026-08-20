package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Return the k points nearest to the origin.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class KClosestPointsToOrigin implements DsaExercise {
    @Override
    public String problem() {
        return "Return the k points nearest to the origin.";
    }

    @Override
    public String hint() {
        return "Keep a size-k max-heap ordered by squared distance.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log k) time, O(k) space";
    }

    public static void main(String[] args) {
        new KClosestPointsToOrigin().printGuide();
    }
}

