/**
 * Notes:
 * code should preferably run in O(n) time
 *
 * @author sunxiaoyang
 */
public class _160_Intersection_of_Two_Linked_Lists {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // two lists are null
        if (headA == null || headB == null) {
            return null;
        }

        // two lists are acutally one
        if (headA == headB) {
            return headA;
        }

        int sumA = 0, sumB = 0;
        for (ListNode temp = headA; temp != null; temp = temp.next) {
            sumA++;
        }
        for (ListNode temp = headB; temp != null; temp = temp.next) {
            sumB++;
        }

        int be = sumA - sumB;
        if (sumA < sumB) {
            ListNode temp = headA;
            headA = headB;
            headB = temp;
            be = sumB - sumA;
        }
        while (be-- != 0) {
            headA = headA.next;
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;
    }
}


