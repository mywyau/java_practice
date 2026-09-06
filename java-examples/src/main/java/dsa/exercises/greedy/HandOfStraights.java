package dsa.exercises.greedy;

import dsa.exercises.DsaExercise;

/**
 * Group cards into consecutive runs of fixed size.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class HandOfStraights implements DsaExercise {
    // The smallest remaining card is forced to begin the next consecutive group.
    public static boolean isNStraightHand(int[] hand, int groupSize) { if (groupSize <= 0 || hand.length % groupSize != 0) return false; java.util.TreeMap<Integer, Integer> counts = new java.util.TreeMap<>(); for (int card : hand) counts.merge(card, 1, Integer::sum); while (!counts.isEmpty()) { int first = counts.firstKey(); for (int card = first; card < first + groupSize; card++) { Integer count = counts.get(card); if (count == null) return false; if (count == 1) counts.remove(card); else counts.put(card, count - 1); } } return true; }

    @Override
    public String problem() {
        return "Group cards into consecutive runs of fixed size.";
    }

    @Override
    public String hint() {
        return "Always start a group from the smallest remaining card.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log n) time, O(n) space";
    }

    public static void main(String[] args) {
        new HandOfStraights().printGuide();
    }
}
