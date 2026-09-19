package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Find combinations that sum to a target with reusable values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CombinationSum implements DsaExercise {
    // Recurse from the same index to permit reuse, while never generating
    // reorderings.
    public static java.util.List<java.util.List<Integer>> combinationSum(int[] candidates, int target) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        combine(candidates, target, 0, new java.util.ArrayList<>(), result);
        return result;
    }

    private static void combine(
            int[] candidates,
            int remaining,
            int start,
            java.util.List<Integer> current,
            java.util.List<java.util.List<Integer>> result
        ) {
            
        if (remaining == 0) {
            // Reaching zero means the current choices total the original target.
            result.add(new java.util.ArrayList<>(current));
            return;
        }

        // start prevents reordered duplicates such as [2, 3] and [3, 2].
        for (int index = start; index < candidates.length; index++) {
            int candidate = candidates[index];
            if (candidate > 0 && candidate <= remaining) {
                current.add(candidate);
                // Pass index again because the same candidate may be reused.
                combine(candidates, remaining - candidate, index, current, result);
                current.removeLast();
            }
        }
    }

    @Override
    public String problem() {
        return "Find combinations that sum to a target with reusable values.";
    }

    @Override
    public String hint() {
        return "Backtrack using a start index to avoid reordered duplicates.";
    }

    @Override
    public String targetComplexity() {
        return "Exponential time, O(target) depth";
    }

    public static void main(String[] args) {
        new CombinationSum().printGuide();
    }
}
