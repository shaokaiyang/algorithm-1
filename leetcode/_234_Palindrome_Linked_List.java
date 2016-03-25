/**
 * Notes:
 * [1]
 *
 * @author sunxiaoyang
 */
public class _234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        // the count of nodes
        ListNode temp = head;
        int sum = 0;
        while (temp != null) {
            sum++;
            temp = temp.next;
        }

        // reverse the last half of list
        int sp = (sum + 1) / 2;
        ListNode sn = head;
        while (sp-- != 0) {
            sn = sn.next;
        }

        ListNode snn = sn != null ? sn.next : null;
        while (snn != null && sn != null) {
            ListNode t = snn.next;
            snn.next = sn;
            sn = snn;
            snn = t;
        }

        // check
        sp = sum / 2;
        temp = head;
        while (sp-- != 0) {
            if (temp.val == sn.val) {
                temp = temp.next;
                sn = sn.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _234_Palindrome_Linked_List a = new _234_Palindrome_Linked_List();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(2);
        ListNode a5 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        System.out.println(a.isPalindrome(a1));
    }

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
}
