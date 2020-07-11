public class MergeTwoSortedLists {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = null, current = null;
        int val1, val2;
        while (true) {
            if (null == l1 && null == l2) {
                return merged;
            }
            if (null != l1) {
                val1 = l1.val;
            } else {
                val1 = Integer.MAX_VALUE;
            }
            if (null != l2) {
                val2 = l2.val;
            } else {
                val2 = Integer.MAX_VALUE;
            }
            if (val1 <= val2) {
                if (null == merged) {
                    merged = new ListNode(val1);
                    val1 = Integer.MAX_VALUE;
                    current = merged;
                } else {
                    current.next = new ListNode(val1);
                    val1 = Integer.MAX_VALUE;
                    current = current.next;
                }
                if (null != l1) {
                    l1 = l1.next;
                }
            } else {
                if (null == merged) {
                    merged = new ListNode(val2);
                    val2 = Integer.MAX_VALUE;
                    current = merged;
                } else {
                    current.next = new ListNode(val2);
                    val2 = Integer.MAX_VALUE;
                    current = current.next;
                }
                if (null != l2) {
                    l2 = l2.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        ListNode node1_4 = new ListNode(4);
        ListNode node1_2 = new ListNode(2, node1_4);
        ListNode node1_1 = new ListNode(1, node1_2);

        ListNode node2_4 = new ListNode(4);
        ListNode node2_3 = new ListNode(3, node2_4);
        ListNode node2_1 = new ListNode(1, node2_3);

        ListNode merged = mergeTwoLists(node1_1, node2_1);

        do {
            System.out.println(merged.val);
            merged = merged.next;
        } while (merged != null);
    }

}
