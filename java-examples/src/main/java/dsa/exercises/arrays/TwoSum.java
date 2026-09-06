package dsa.exercises.arrays;

import dsa.exercises.DsaExercise;
import java.util.HashMap;
import java.util.Map;

/**
 * Find two indices whose values add to a target.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class TwoSum implements DsaExercise {
    /**
     * Returns the indexes of the first pair found whose values add to {@code target}.
     *
     * <p>The map contains values from earlier positions. For each number, we ask
     * whether its complement ({@code target - number}) has already been seen.
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int index = 0; index < numbers.length; index++) {
            int complement = target - numbers[index];
            if (indexByValue.containsKey(complement)) {
                return new int[] {indexByValue.get(complement), index};
            }
            indexByValue.put(numbers[index], index);
        }

        throw new IllegalArgumentException("No two numbers add to the target");
    }

    @Override
    public String problem() {
        return "Find two indices whose values add to a target.";
    }

    @Override
    public String hint() {
        return "Use a map from value to index while scanning once.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        TwoSum exercise = new TwoSum();
        exercise.printGuide();
        System.out.println("Example: " + java.util.Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));
    }
}
