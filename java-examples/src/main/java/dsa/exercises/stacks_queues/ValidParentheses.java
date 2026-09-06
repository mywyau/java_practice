package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * Check whether brackets are correctly nested.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ValidParentheses implements DsaExercise {
    // The stack contains opening brackets that still need matching closers.
    public static boolean isValid(String text) { java.util.Deque<Character> stack = new java.util.ArrayDeque<>(); for (char c : text.toCharArray()) { if (c == '(' || c == '[' || c == '{') stack.push(c); else { if (stack.isEmpty()) return false; char open = stack.pop(); if (c == ')' && open != '(' || c == ']' && open != '[' || c == '}' && open != '{') return false; } } return stack.isEmpty(); }

    @Override
    public String problem() {
        return "Check whether brackets are correctly nested.";
    }

    @Override
    public String hint() {
        return "Push opening brackets and match each closing bracket.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        new ValidParentheses().printGuide();
    }
}
