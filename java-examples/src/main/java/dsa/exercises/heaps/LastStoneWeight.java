package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Repeatedly smash the two heaviest stones.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LastStoneWeight implements DsaExercise {
    // A max-heap exposes the two heaviest remaining stones at every step.
    public static int lastStoneWeight(int[] stones) { java.util.PriorityQueue<Integer> heap = new java.util.PriorityQueue<>(java.util.Comparator.reverseOrder()); for (int stone : stones) heap.add(stone); while (heap.size() > 1) { int first = heap.remove(), second = heap.remove(); if (first != second) heap.add(first - second); } return heap.isEmpty() ? 0 : heap.remove(); }

    @Override
    public String problem() {
        return "Repeatedly smash the two heaviest stones.";
    }

    @Override
    public String hint() {
        return "Use a max-heap to retrieve the heaviest pair.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(n) space";
    }

    public static void main(String[] args) {
        new LastStoneWeight().printGuide();
    }
}
