package dsa.exercises.hashing;

import dsa.exercises.DsaExercise;

/**
 * Check whether characters in two strings map one-to-one.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class IsomorphicStrings implements DsaExercise {
    // Both maps are required to make the character relationship one-to-one.
    public static boolean isIsomorphic(String first, String second) {
        if (first.length() != second.length()) return false;
        java.util.Map<Character, Character> forward = new java.util.HashMap<>(), reverse = new java.util.HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char a = first.charAt(i), b = second.charAt(i);
            if (forward.containsKey(a) && forward.get(a) != b || reverse.containsKey(b) && reverse.get(b) != a) return false;
            forward.put(a, b); reverse.put(b, a);
        }
        return true;
    }

    @Override
    public String problem() {
        return "Check whether characters in two strings map one-to-one.";
    }

    @Override
    public String hint() {
        return "Maintain mappings in both directions.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(k) space";
    }

    public static void main(String[] args) {
        new IsomorphicStrings().printGuide();
    }
}
