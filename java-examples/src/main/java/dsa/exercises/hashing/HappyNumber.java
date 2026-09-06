package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Detect whether repeatedly summing squared digits reaches one.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class HappyNumber implements DsaExercise {
    // Floyd's slow/fast technique detects a repeated value without a visited set.
    public static boolean isHappy(int number) {
        int slow = number, fast = next(number);
        while (fast != 1 && slow != fast) { slow = next(slow); fast = next(next(fast)); }
        return fast == 1;
    }

    private static int next(int number) {
        int sum = 0;
        while (number != 0) { int digit = number % 10; sum += digit * digit; number /= 10; }
        return sum;
    }

    @Override
    public String problem() {
        return "Detect whether repeatedly summing squared digits reaches one.";
    }

    @Override
    public String hint() {
        return "Use a set or Floyd's cycle detection.";
    }

    @Override
    public String targetComplexity() {
        return "O(log n) work per step";
    }

    public static void main(String[] args) {
        new HappyNumber().printGuide();
    }
}
