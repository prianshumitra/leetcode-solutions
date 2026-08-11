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
        
        // 1. find mid using floyd's hare and tortoise method
        // 2. reverse the linked list from the mid to end into a new linked list
        // 3. make the first linked list null after mid
        // 4. merge both the linked list

        // #1#
        ListNode slow,fast;
        slow = fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode head2 = mid.next;
        mid.next = null;

        // #2#

        ListNode preptr = null;
        ListNode ptr = head2;

        while (ptr != null) {
            ListNode temp = ptr.next;
            ptr.next = preptr;

            preptr = ptr;
            ptr = temp;
        }
        head2 = preptr;

        // #3#
        ListNode ptr1 = head;
        ListNode ptr2 = head2;

        while(ptr2 != null) {
            ListNode temp = ptr1.next;
            ListNode temp2 = ptr2.next;
            ptr1.next = ptr2;
            ptr2.next = temp;

            ptr1 = temp;
            ptr2 = temp2;
        }

    }
}