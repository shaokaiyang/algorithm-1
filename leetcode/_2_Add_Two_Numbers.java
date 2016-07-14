/**
 * @author sunxiaoyang
 */
public class _2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        ListNode res = new ListNode(0);
        ListNode cur = res;

        while (true) {
            int v = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            cur.val = v + cur.val;
            if (cur.val > 9) {
                cur.next = new ListNode(cur.val / 10);
                cur.val = cur.val % 10;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (l1 == null && l2 == null) break;
            if (cur.next == null) cur.next = new ListNode(0);
            cur = cur.next;
        }
        return res;
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
