package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Remove the nth node measured from the list's end.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class RemoveNthNodeFromEnd implements DsaExercise {
    // Keeping an n-node gap makes slow stop just before the node to remove.
    public static class ListNode { public int value; public ListNode next; public ListNode(int value) { this.value = value; } public ListNode(int value, ListNode next) { this.value = value; this.next = next; } }
    public static ListNode removeNthFromEnd(ListNode head, int n) { if (n <= 0) throw new IllegalArgumentException("n must be positive"); ListNode dummy = new ListNode(0, head), fast = dummy, slow = dummy; for (int i = 0; i < n; i++) { fast = fast.next; if (fast == null) throw new IllegalArgumentException("n exceeds list length"); } while (fast.next != null) { fast = fast.next; slow = slow.next; } slow.next = slow.next.next; return dummy.next; }

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
