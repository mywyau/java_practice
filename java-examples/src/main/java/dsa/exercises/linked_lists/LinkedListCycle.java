package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Determine whether a linked list contains a cycle.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class LinkedListCycle implements DsaExercise {
    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    /** Uses Floyd's two-speed pointer technique without storing visited nodes. */
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Short-circuiting makes fast.next safe: it is read only when fast is non-null.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // == checks whether both variables reference the same node.
                return true;
            }
        }
        return false;
    }

    @Override
    public String problem() {
        return "Determine whether a linked list contains a cycle.";
    }

    @Override
    public String hint() {
        return "Move one pointer once and another twice per step.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new LinkedListCycle().printGuide();
    }
}
