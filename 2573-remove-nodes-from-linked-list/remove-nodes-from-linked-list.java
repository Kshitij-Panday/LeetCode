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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            while (!stack.isEmpty() && stack.peek().val < temp.val) {
                stack.pop();
            }
            stack.push(temp);
            temp = temp.next;

        }
        while(!stack.isEmpty()){
            ListNode top = stack.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
    }
}