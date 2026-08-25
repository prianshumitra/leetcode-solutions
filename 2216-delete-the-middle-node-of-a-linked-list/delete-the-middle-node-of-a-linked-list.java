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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode preslow = slow;

        if(head == null) return head;
        if(head.next == null) return null;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            preslow = slow;
            slow = slow.next;
        }
        preslow.next = slow.next;
        return head;
    }
}