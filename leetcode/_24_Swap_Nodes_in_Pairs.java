/**
 * @author sunxiaoyang
 */
public class _24_Swap_Nodes_in_Pairs {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 2016-03-06
    public ListNode swapPairs_1(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null) {
                int t = temp.val;
                temp.val = temp.next.val;
                temp.next.val = t;
                temp = temp.next.next;
            } else {
                break;
            }
        }
        return head;
    }

    // 2017-03-18
    public ListNode swapPairs(ListNode head) {
        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            tmp.val ^= tmp.next.val;
            tmp.next.val ^= tmp.val;
            tmp.val ^= tmp.next.val;
            tmp = tmp.next.next;
        }
        return head;
    }


}