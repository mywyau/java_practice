package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Generate all balanced strings containing n bracket pairs.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class GenerateParentheses implements DsaExercise {
    /** Builds only valid prefixes, pruning impossible strings immediately. */
    public static java.util.List<String> generateParenthesis(int n) {
        java.util.List<String> result = new java.util.ArrayList<>();
        generate(n, 0, 0, new StringBuilder(), result);
        return result;
    }

    private static void generate(int n, int open, int closed,
            StringBuilder current, java.util.List<String> result) {
        if (current.length() == n * 2) {
            result.add(current.toString());
            return;
        }
        if (open < n) {
            current.append('(');
            generate(n, open + 1, closed, current, result);
            current.deleteCharAt(current.length() - 1); // Undo the append.
        }
        if (closed < open) { // A close needs an unmatched opening bracket.
            current.append(')');
            generate(n, open, closed + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

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
