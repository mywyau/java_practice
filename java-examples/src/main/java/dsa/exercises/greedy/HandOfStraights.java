package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Group cards into consecutive runs of fixed size.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class HandOfStraights implements DsaExercise {
    @Override
    public String problem() {
        return "Group cards into consecutive runs of fixed size.";
    }

    @Override
    public String hint() {
        return "Always start a group from the smallest remaining card.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(n) space";
    }

    public static void main(String[] args) {
        new HandOfStraights().printGuide();
    }
}

