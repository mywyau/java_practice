package dsa.exercises.strings;

import dsa.exercises.DsaExercise;

/**
 * Decide whether two strings contain identical character counts.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidAnagram implements DsaExercise {
    @Override
    public String problem() {
        return "Decide whether two strings contain identical character counts.";
    }

    @Override
    public String hint() {
        return "Count characters in one string and subtract counts from the other.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) alphabet space";
    }

    public static void main(String[] args) {
        new ValidAnagram().printGuide();
    }
}

