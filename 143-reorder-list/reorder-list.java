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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middle(head);

        ListNode fh = head;
        ListNode sh = reverseList(mid);
        ListNode temp;

        while (fh != null && sh != null) {
            temp = fh.next;
            fh.next = sh;
            fh = temp;

            temp = sh.next;
            sh.next = fh;
            sh = temp;
        }
            if (fh != null) {
                fh.next = null;
            }
        

    }

    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode nextt = current.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = nextt;
            if (nextt != null) {
                nextt = nextt.next;
            }

        }
        head = prev;
        return head;
    }
}