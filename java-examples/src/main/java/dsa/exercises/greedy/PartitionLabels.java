package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Split a string so each character appears in one part.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class PartitionLabels implements DsaExercise {
    @Override
    public String problem() {
        return "Split a string so each character appears in one part.";
    }

    @Override
    public String hint() {
        return "End a partition when reaching all seen characters' last positions.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new PartitionLabels().printGuide();
    }
}

