package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Return sorted squares of a sorted array.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class SquaresOfSortedArray implements DsaExercise {
    // The largest remaining square must come from one of the two input ends.
    public static int[] sortedSquares(int[] numbers) { int[] result = new int[numbers.length]; int left = 0, right = numbers.length - 1; for (int output = result.length - 1; output >= 0; output--) { int a = numbers[left] * numbers[left], b = numbers[right] * numbers[right]; if (a > b) { result[output] = a; left++; } else { result[output] = b; right--; } } return result; }

    @Override
    public String problem() {
        return "Return sorted squares of a sorted array.";
    }

    @Override
    public String hint() {
        return "Compare absolute values at both ends and fill backward.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) output space";
    }

    public static void main(String[] args) {
        new SquaresOfSortedArray().printGuide();
    }
}
