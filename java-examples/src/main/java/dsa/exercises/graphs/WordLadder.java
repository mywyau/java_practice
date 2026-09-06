package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Find the shortest one-letter transformation sequence.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class WordLadder implements DsaExercise {
    // BFS explores all words at one transformation distance before the next distance.
    public static int ladderLength(String begin, String end, java.util.Collection<String> wordList) { java.util.Set<String> unused = new java.util.HashSet<>(wordList); if (!unused.contains(end)) return 0; java.util.Queue<String> queue = new java.util.ArrayDeque<>(); queue.add(begin); unused.remove(begin); int length = 1; while (!queue.isEmpty()) { int size = queue.size(); while (size-- > 0) { String word = queue.remove(); if (word.equals(end)) return length; char[] letters = word.toCharArray(); for (int i = 0; i < letters.length; i++) { char original = letters[i]; for (char c = 'a'; c <= 'z'; c++) { letters[i] = c; String candidate = new String(letters); if (unused.remove(candidate)) queue.add(candidate); } letters[i] = original; } } length++; } return 0; }

    @Override
    public String problem() {
        return "Find the shortest one-letter transformation sequence.";
    }

    @Override
    public String hint() {
        return "BFS through valid wildcard or generated neighbors.";
    }

    @Override
    public String targetComplexity() {
        return "O(words·wordLength²) time";
    }

    public static void main(String[] args) {
        new WordLadder().printGuide();
    }
}
