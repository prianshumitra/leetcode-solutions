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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ptr = head;
        ListNode nextptr = ptr.next;

         // First pair
        head = nextptr;
        ptr.next = nextptr.next;
        nextptr.next = ptr;

        // ptr is now the tail of the first swapped pair
        ListNode prev = ptr;
        ptr = ptr.next;

        while(ptr != null && ptr.next != null) {
            nextptr = ptr.next; 
            ptr.next = nextptr.next; 
            nextptr.next = ptr; 
            prev.next = nextptr; 
            prev = ptr; 
            ptr = ptr.next;
        }
        return head;
    }
}