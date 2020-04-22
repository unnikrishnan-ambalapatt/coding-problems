/**
 * 2. Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {

    public static int addTwoNumbers(ListNode l1, ListNode l2) {
        Integer n1 = 0, n2 = 0, sum = 0;
        int multiplicationFactor = 1;
        //ListNode
        do {
            n1 = n1 + l1.val * multiplicationFactor;
            multiplicationFactor = multiplicationFactor * 10;
            l1 = l1.next;
        } while(null != l1);
        multiplicationFactor = 1;
        do {
            n2 = n2 + l2.val * multiplicationFactor;
            multiplicationFactor = multiplicationFactor * 10;
            l2 = l2.next;
        } while(null != l2);
        sum = n1 + n2;

        //TODO: Return linked list in a similar fashion as inputs

        return sum;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.setNext(l12);
        l12.setNext(l13);
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l21.setNext(l22);
        l22.setNext(l23);
        System.out.println(addTwoNumbers(l11, l21));
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}