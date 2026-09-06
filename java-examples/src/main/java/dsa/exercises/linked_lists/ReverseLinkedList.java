package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Reverse a singly linked list in place.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReverseLinkedList implements DsaExercise {
    // Save next before rewiring the link, or the unprocessed suffix would be lost.
    public static class ListNode { public int value; public ListNode next; public ListNode(int value) { this.value = value; } public ListNode(int value, ListNode next) { this.value = value; this.next = next; } }
    public static ListNode reverseList(ListNode head) { ListNode previous = null; while (head != null) { ListNode next = head.next; head.next = previous; previous = head; head = next; } return previous; }

    @Override
    public String problem() {
        return "Reverse a singly linked list in place.";
    }

    @Override
    public String hint() {
        return "Track previous, current, and next nodes.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ReverseLinkedList().printGuide();
    }
}
