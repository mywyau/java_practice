package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Generate every ordering of distinct values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class Permutations implements DsaExercise {
    // used records which values are unavailable on the current recursive path.
    public static java.util.List<java.util.List<Integer>> permute(int[] numbers) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        arrange(numbers, new boolean[numbers.length], new java.util.ArrayList<>(), result);
        return result;
    }

    private static void arrange(int[] numbers, boolean[] used, java.util.List<Integer> current,
            java.util.List<java.util.List<Integer>> result) {
        if (current.size() == numbers.length) {
            result.add(new java.util.ArrayList<>(current));
            return;
        }
        for (int i = 0; i < numbers.length; i++)
            if (!used[i]) {
                used[i] = true;
                current.add(numbers[i]);
                arrange(numbers, used, current, result);
                current.removeLast();
                used[i] = false;
            }
    }

    @Override
    public String problem() {
        return "Generate every ordering of distinct values.";
    }

    @Override
    public String hint() {
        return "Choose each unused value for the next position.";
    }

    @Override
    public String targetComplexity() {
        return "O(n·n!) time, O(n) recursion";
    }

    public static void main(String[] args) {
        new Permutations().printGuide();
    }
}
