package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Evaluate an expression written in postfix notation.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class EvaluateReversePolishNotation implements DsaExercise {
    @Override
    public String problem() {
        return "Evaluate an expression written in postfix notation.";
    }

    @Override
    public String hint() {
        return "Push numbers; pop two operands for every operator.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        new EvaluateReversePolishNotation().printGuide();
    }
}

