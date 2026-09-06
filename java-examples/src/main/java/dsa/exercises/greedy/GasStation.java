package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Find a station from which a full circuit is possible.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class GasStation implements DsaExercise {
    // A negative tank invalidates this start and every start crossed since it.
    public static int canCompleteCircuit(int[] gas, int[] cost) { if (gas.length != cost.length) throw new IllegalArgumentException("array lengths differ"); int total = 0, tank = 0, start = 0; for (int i = 0; i < gas.length; i++) { int gain = gas[i] - cost[i]; total += gain; tank += gain; if (tank < 0) { start = i + 1; tank = 0; } } return total >= 0 && gas.length > 0 ? start : -1; }

    @Override
    public String problem() {
        return "Find a station from which a full circuit is possible.";
    }

    @Override
    public String hint() {
        return "Reset the candidate after any prefix with negative fuel.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new GasStation().printGuide();
    }
}
