package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Evaluate an expression written in postfix notation.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class EvaluateReversePolishNotation implements DsaExercise {
    // Operators consume two recent results; the first pop is the right operand.
    public static int evalRPN(String[] tokens) { java.util.Deque<Integer> stack = new java.util.ArrayDeque<>(); for (String token : tokens) { if (!"+-*/".contains(token) || token.length() != 1) stack.push(Integer.parseInt(token)); else { int right = stack.pop(), left = stack.pop(); stack.push(switch (token) { case "+" -> left + right; case "-" -> left - right; case "*" -> left * right; default -> left / right; }); } } if (stack.size() != 1) throw new IllegalArgumentException("invalid expression"); return stack.pop(); }

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
