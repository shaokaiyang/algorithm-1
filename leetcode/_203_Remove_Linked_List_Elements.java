/**
 * @author sunxiaoyang
 */
public class _203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return head;

        ListNode temp = head;
        ListNode tmpnext = head.next;

        while (temp != null && tmpnext != null) {
            if (tmpnext.val == val) {
                temp.next = tmpnext.next;
            } else {
                temp = tmpnext;
            }
            tmpnext = tmpnext.next;
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