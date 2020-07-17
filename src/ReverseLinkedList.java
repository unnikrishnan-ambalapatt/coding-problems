import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 206. Reverse Linked List
 * <p>
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseListWithStack(ListNode head) {
        ListNode reversed = null, lastEncountered = null;
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            reversed = stack.removeLast();
            reversed.next = lastEncountered;
            lastEncountered = reversed;
        }
        return reversed;
    }

    public static ListNode reverseListWithList(ListNode head) {
        ListNode reversed = null, lastEncountered = null;
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (ListNode node : list) {
            reversed = node;
            reversed.next = lastEncountered;
            lastEncountered = reversed;
        }
        return reversed;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head, previous = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {

        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        ListNode reversed = reverseList(one);

        while (reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }
}

