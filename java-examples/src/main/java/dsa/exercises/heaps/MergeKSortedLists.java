package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Merge k already-sorted linked lists.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MergeKSortedLists implements DsaExercise {
    // The heap holds only each list's next candidate, limiting its size to k.
    public static class ListNode { public int value; public ListNode next; public ListNode(int value) { this.value = value; } }
    public static ListNode mergeKLists(ListNode[] lists) { java.util.PriorityQueue<ListNode> heap = new java.util.PriorityQueue<>(java.util.Comparator.comparingInt(node -> node.value)); for (ListNode node : lists) if (node != null) heap.add(node); ListNode dummy = new ListNode(0), tail = dummy; while (!heap.isEmpty()) { tail.next = heap.remove(); tail = tail.next; if (tail.next != null) heap.add(tail.next); } return dummy.next; }

    @Override
    public String problem() {
        return "Merge k already-sorted linked lists.";
    }

    @Override
    public String hint() {
        return "Keep each list's current smallest node in a min-heap.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log k) time, O(k) space";
    }

    public static void main(String[] args) {
        new MergeKSortedLists().printGuide();
    }
}
