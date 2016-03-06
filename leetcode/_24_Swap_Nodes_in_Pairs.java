/**
 * @author sunxiaoyang
 */
public class _24_Swap_Nodes_in_Pairs {

    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null) {
                int t = temp.val;
                temp.val = temp.next.val;
                temp.next.val = t;
                temp = temp.next.next;
            }else{
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }


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
}