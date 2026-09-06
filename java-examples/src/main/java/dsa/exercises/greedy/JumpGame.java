package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Decide whether the final array index is reachable.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class JumpGame implements DsaExercise {
    // farthest summarizes every route reachable from the processed prefix.
    public static boolean canJump(int[] numbers) { int farthest = 0; for (int i = 0; i < numbers.length; i++) { if (i > farthest) return false; farthest = Math.max(farthest, i + numbers[i]); } return true; }

    @Override
    public String problem() {
        return "Decide whether the final array index is reachable.";
    }

    @Override
    public String hint() {
        return "Track the furthest reachable index while scanning.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new JumpGame().printGuide();
    }
}
