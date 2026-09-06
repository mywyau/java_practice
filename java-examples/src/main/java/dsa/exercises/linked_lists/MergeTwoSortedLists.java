package dsa.exercises.linked_lists;

import dsa.exercises.DsaExercise;

/**
 * Merge two sorted linked lists.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MergeTwoSortedLists implements DsaExercise {
    // A dummy head removes the special case for attaching the first result node.
    public static class ListNode { public int value; public ListNode next; public ListNode(int value) { this.value = value; } public ListNode(int value, ListNode next) { this.value = value; this.next = next; } }
    public static ListNode mergeTwoLists(ListNode first, ListNode second) { ListNode dummy = new ListNode(0), tail = dummy; while (first != null && second != null) { if (first.value <= second.value) { tail.next = first; first = first.next; } else { tail.next = second; second = second.next; } tail = tail.next; } tail.next = first != null ? first : second; return dummy.next; }

    @Override
    public String problem() {
        return "Merge two sorted linked lists.";
    }

    @Override
    public String hint() {
        return "Attach the smaller current node to a dummy-headed result.";
    }

    @Override
    public String targetComplexity() {
        return "O(n+m) time, O(1) space";
    }

    public static void main(String[] args) {
        new MergeTwoSortedLists().printGuide();
    }
}
