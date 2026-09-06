package dsa.exercises.dynamic_programming;

import dsa.exercises.DsaExercise;

/**
 * Decide whether a string can be segmented into dictionary words.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class WordBreak implements DsaExercise {
    // reachable[end] means the whole prefix before end can be split into known words.
    public static boolean wordBreak(String text, java.util.Collection<String> dictionary) {
        java.util.Set<String> words = new java.util.HashSet<>(dictionary); boolean[] reachable = new boolean[text.length() + 1]; reachable[0] = true;
        for (int end = 1; end <= text.length(); end++) for (int start = 0; start < end; start++) if (reachable[start] && words.contains(text.substring(start, end))) { reachable[end] = true; break; }
        return reachable[text.length()];
    }

    @Override
    public String problem() {
        return "Decide whether a string can be segmented into dictionary words.";
    }

    @Override
    public String hint() {
        return "Mark each reachable prefix using earlier reachable positions.";
    }

    @Override
    public String targetComplexity() {
        return "O(n²) time, O(n) space";
    }

    public static void main(String[] args) {
        new WordBreak().printGuide();
    }
}
