/**
 * Notes:
 * 第一个节点的大小问题
 *
 * @author sunxiaoyang
 */
public class _21_Merge_Two_Sorted_Lists {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 2016-03-20
    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        ListNode l1s = l1, l1sf = new ListNode(0);
        ListNode l2s = l2, l2sf = new ListNode(0);
        l1sf.next = l1;
        l2sf.next = l2;

        if (l1 == null) {
            l1 = l2;
            return l1;
        } else if (l2 != null && l1.val > l2.val) {
            l1 = l2;
        }

        while (l1s != null && l2s != null) {
            if (l1s.val > l2s.val) {
                l2s = l2s.next;
                l2sf.next.next = l1s;
                l1sf.next = l2sf.next;
                l1sf = l2sf.next;
                l2sf.next = l2s;
            } else {
                l1sf = l1s;
                l1s = l1s.next;
            }
        }

        if (l2s != null) {
            l1sf.next = l2s;
        }
        return l1;
    }

    // 2017-03-18
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head, tmp;
        head = tmp = new ListNode(0);
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                tmp.next = l2;
                tmp = l2;
                l2 = l2.next;
            } else {
                tmp.next = l1;
                tmp = l1;
                l1 = l1.next;
            }
        }
        if (l1 != null) tmp.next = l1;
        if (l2 != null) tmp.next = l2;

        return head.next;
    }


    public static void main(String[] args) {
        _21_Merge_Two_Sorted_Lists a = new _21_Merge_Two_Sorted_Lists();
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        ListNode head = a.mergeTwoLists(l1, l2);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}