/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 0 || k == 1) {
            return head;
        }

        if (head == null) {
            return null;
        }

        ListNode now = head;
        int i = 1;
        ListNode r = new ListNode(0);
        ListNode last = r;
        ListNode tempHead = null;
        ListNode tempTail = null;
        while (now != null) {
            ListNode temp = new ListNode(now.val);
            if (i == 1) {
                tempHead = temp;
                tempHead.next = null;
                tempTail = temp;
                tempTail.next = null;
                i++;
            } else if (i == k) {
                temp.next = tempHead;
                tempHead = temp;
                last.next = tempHead;
                last = tempTail;
                tempHead = null;
                tempTail = null;
                i = 1;
            } else {
                temp.next = tempHead;
                tempHead = temp;
                i++;
            }
            now = now.next;
        }

        ListNode tailHead = null;
        while (tempHead != null) {
            ListNode temp = new ListNode(tempHead.val);
            temp.next = tailHead;
            tailHead = temp;
            last.next = tailHead;
            tempHead = tempHead.next;
        }

        return r.next;
    }

}