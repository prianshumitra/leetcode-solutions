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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            return head;
        }
        
        ListNode ptr = head.next;
        ListNode preptr = head;

        while(ptr != null) {

            if(preptr.val == ptr.val) {
                preptr.next = ptr.next;
                ptr = ptr.next;
            }

            else {
                preptr = ptr;
                ptr = ptr.next;
            }
        }
        return head;
    }
}