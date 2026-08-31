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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;
        int size = 1;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size == 1){
            return head;
        }
        int val1 = 0;
        int val2 = 0;

        for(int i =1; i<k;i++){
            first = first.next;
        }
        val1 += first.val;

        for(int i = 1; i<(size-k);i++){
            second = second.next;
        }
        val2 += second.val;

        int temp1 = val1;
        first.val = val2;
        second.val = temp1;

        return head;

    }

}