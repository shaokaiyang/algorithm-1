/**
 * @author sunxiaoyang
 */
public class _237_Delete_Node_in_a_Linked_List {

    public void deleteNode(ListNode node) {
        if (node == null) return;
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        } else {
            node = null;
        }
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
