package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Remove the nth node measured from the list's end.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class RemoveNthNodeFromEnd implements DsaExercise {
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

    /** Keeps two pointers n nodes apart so no length pre-pass is needed. */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        // A dummy predecessor also handles removing the real head.
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int gap = 0; gap < n; gap++) {
            fast = fast.next;
            if (fast == null) {
                throw new IllegalArgumentException("n exceeds list length");
            }
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next; // Bypass the node, removing it from the chain.
        return dummy.next;
    }

    @Override
    public String problem() {
        return "Remove the nth node measured from the list's end.";
    }

    @Override
    public String hint() {
        return "Keep two pointers n nodes apart.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new RemoveNthNodeFromEnd().printGuide();
    }
}
