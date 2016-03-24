/**
 * @author sunxiaoyang
 */
public class _206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode t1 = head;
        ListNode t2 = head.next;
        while (t1 != null && t2 != null) {
            ListNode tm = t2.next;
            t2.next = t1;
            t1 = t2;
            t2 = tm;
        }
        head.next = null;
        return t1;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
