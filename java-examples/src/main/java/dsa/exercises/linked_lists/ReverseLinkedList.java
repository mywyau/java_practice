package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Reverse a singly linked list in place.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReverseLinkedList implements DsaExercise {
    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this(value, null);
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    /** Reverses each arrow in place and returns the list's new head. */
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            // Save the unprocessed list before changing current.next.
            ListNode next = current.next;
            current.next = previous;

            // Move both pointers one node forward.
            previous = current;
            current = next;
        }
        return previous;
    }

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
