package dsa.exercises.two_pointers;

import dsa.exercises.DsaExercise;

/**
 * Remove duplicates in place and return the new length.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class RemoveDuplicatesFromSortedArray implements DsaExercise {
    // The prefix before write always contains the unique values seen so far.
    public static int removeDuplicates(int[] numbers) {

        if (numbers.length == 0)
            return 0;
        int write = 1;
        for (int read = 1; read < numbers.length; read++)
            if (numbers[read] != numbers[write - 1])
                numbers[write++] = numbers[read];
        return write;
    }

    public static int removeDuplicates2(int[] numbers) {
        
        // base case where if empty list just return 0 i.e. no result
        if (numbers.length == 0)
            return 0;

        // set write count to 1
        int write = 1;

        // iterate numbers using read 
        for (int read = 1; read < numbers.length; read++)
            if (numbers[read] != numbers[write - 1]) // conditional for updating the array, if the current value in the array != the previous then execute if statement
                numbers[write++] = numbers[read]; // update ??? look into this and learn

        return write;
    }

    @Override
    public String problem() {
        return "Remove duplicates in place and return the new length.";
    }

    @Override
    public String hint() {
        return "Use a read pointer and a slower write pointer.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArray().printGuide();
    }
}
