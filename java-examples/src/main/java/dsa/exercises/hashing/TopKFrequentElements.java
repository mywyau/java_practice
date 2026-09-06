package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Return the k most frequent values.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class TopKFrequentElements implements DsaExercise {
    // A value can occur at most n times, so its count can index an O(n) bucket array.
    public static int[] topKFrequent(int[] numbers, int k) {
        java.util.Map<Integer, Integer> counts = new java.util.HashMap<>();
        for (int number : numbers) counts.merge(number, 1, Integer::sum);
        if (k < 0 || k > counts.size()) throw new IllegalArgumentException("k exceeds unique values");
        java.util.List<java.util.List<Integer>> buckets = new java.util.ArrayList<>(numbers.length + 1);
        for (int i = 0; i <= numbers.length; i++) buckets.add(new java.util.ArrayList<>());
        counts.forEach((number, count) -> buckets.get(count).add(number));
        int[] result = new int[k]; int output = 0;
        for (int count = buckets.size() - 1; count >= 0 && output < k; count--)
            for (int number : buckets.get(count)) { result[output++] = number; if (output == k) break; }
        return result;
    }

    @Override
    public String problem() {
        return "Return the k most frequent values.";
    }

    @Override
    public String hint() {
        return "Count values, then use buckets or a heap.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) bucket time, O(n) space";
    }

    public static void main(String[] args) {
        new TopKFrequentElements().printGuide();
    }
}
