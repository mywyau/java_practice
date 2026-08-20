package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Generate all balanced strings containing n bracket pairs.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class GenerateParentheses implements DsaExercise {
    @Override
    public String problem() {
        return "Generate all balanced strings containing n bracket pairs.";
    }

    @Override
    public String hint() {
        return "Add an opening bracket when available and close only valid prefixes.";
    }

    @Override
    public String targetComplexity() {
        return "Catalan output size";
    }

    public static void main(String[] args) {
        new GenerateParentheses().printGuide();
    }
}

