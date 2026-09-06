package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Reorder L0→L1→… as L0→Ln→L1→Ln-1→….
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class ReorderList implements DsaExercise {
    // Split the list, reverse its second half, and alternate nodes from both halves.
    public static class ListNode { public int value; public ListNode next; public ListNode(int value) { this.value = value; } }
    public static void reorderList(ListNode head) { if (head == null || head.next == null) return; ListNode slow = head, fast = head; while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; } ListNode second = slow.next; slow.next = null; ListNode previous = null; while (second != null) { ListNode next = second.next; second.next = previous; previous = second; second = next; } ListNode first = head; second = previous; while (second != null) { ListNode nextFirst = first.next, nextSecond = second.next; first.next = second; second.next = nextFirst; first = nextFirst; second = nextSecond; } }

    @Override
    public String problem() {
        return "Reorder L0→L1→… as L0→Ln→L1→Ln-1→….";
    }

    @Override
    public String hint() {
        return "Find the middle, reverse the second half, then weave.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new ReorderList().printGuide();
    }
}
