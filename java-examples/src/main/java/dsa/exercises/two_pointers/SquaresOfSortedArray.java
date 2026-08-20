package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Return sorted squares of a sorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class SquaresOfSortedArray implements DsaExercise {
    @Override
    public String problem() {
        return "Return sorted squares of a sorted array.";
    }

    @Override
    public String hint() {
        return "Compare absolute values at both ends and fill backward.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) output space";
    }

    public static void main(String[] args) {
        new SquaresOfSortedArray().printGuide();
    }
}

