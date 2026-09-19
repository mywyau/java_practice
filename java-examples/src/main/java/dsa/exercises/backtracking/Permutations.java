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
            // Store a snapshot; current itself is reused to build other permutations.
            result.add(new java.util.ArrayList<>(current));
            return;
        }

        for (int index = 0; index < numbers.length; index++) {
            if (!used[index]) {
                used[index] = true; // Choose.
                current.add(numbers[index]);
                arrange(numbers, used, current, result);
                current.removeLast(); // Undo both changes before trying a sibling.
                used[index] = false;
            }
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
