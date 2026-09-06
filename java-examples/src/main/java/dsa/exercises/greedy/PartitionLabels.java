package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Split a string so each character appears in one part.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class PartitionLabels implements DsaExercise {
    // Close only after reaching the last occurrence of every character seen.
    public static java.util.List<Integer> partitionLabels(String text) { java.util.Map<Character, Integer> last = new java.util.HashMap<>(); for (int i = 0; i < text.length(); i++) last.put(text.charAt(i), i); java.util.List<Integer> result = new java.util.ArrayList<>(); int start = 0, end = 0; for (int i = 0; i < text.length(); i++) { end = Math.max(end, last.get(text.charAt(i))); if (i == end) { result.add(end - start + 1); start = i + 1; } } return result; }

    @Override
    public String problem() {
        return "Split a string so each character appears in one part.";
    }

    @Override
    public String hint() {
        return "End a partition when reaching all seen characters' last positions.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new PartitionLabels().printGuide();
    }
}
