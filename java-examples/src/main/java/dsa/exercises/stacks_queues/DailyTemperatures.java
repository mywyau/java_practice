package dsa.exercises.stacks_queues;

import dsa.exercises.DsaExercise;

/**
 * For each day, find how long until a warmer temperature.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class DailyTemperatures implements DsaExercise {
    // The stack holds unresolved days in decreasing temperature order.
    public static int[] dailyTemperatures(int[] temperatures) { int[] waits = new int[temperatures.length]; java.util.Deque<Integer> stack = new java.util.ArrayDeque<>(); for (int day = 0; day < temperatures.length; day++) { while (!stack.isEmpty() && temperatures[day] > temperatures[stack.peek()]) { int previous = stack.pop(); waits[previous] = day - previous; } stack.push(day); } return waits; }

    @Override
    public String problem() {
        return "For each day, find how long until a warmer temperature.";
    }

    @Override
    public String hint() {
        return "Keep indices in a decreasing monotonic stack.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(n) space";
    }

    public static void main(String[] args) {
        new DailyTemperatures().printGuide();
    }
}
