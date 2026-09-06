package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Generate the power set of distinct values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class Subsets implements DsaExercise {
    // Every value creates two branches: exclude it or include it, then undo the choice.
    public static java.util.List<java.util.List<Integer>> subsets(int[] numbers) { java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>(); build(numbers, 0, new java.util.ArrayList<>(), result); return result; }
    private static void build(int[] numbers, int index, java.util.List<Integer> current, java.util.List<java.util.List<Integer>> result) { if (index == numbers.length) { result.add(new java.util.ArrayList<>(current)); return; } build(numbers, index + 1, current, result); current.add(numbers[index]); build(numbers, index + 1, current, result); current.removeLast(); }

    @Override
    public String problem() {
        return "Generate the power set of distinct values.";
    }

    @Override
    public String hint() {
        return "At each index choose whether to include the value.";
    }

    @Override
    public String targetComplexity() {
        return "O(n·2ⁿ) time, O(n) recursion";
    }

    public static void main(String[] args) {
        new Subsets().printGuide();
    }
}
