/**
 * Notes:
 * [1]
 *
 * @author sunxiaoyang
 */
public class _19_Remove_Nth_Node_From_End_of_List {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length > n) {
            temp = head;
            n = length - n;
            while (n-- > 1) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
        if (length == n) {
            return head.next;
        }
        return head;
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
