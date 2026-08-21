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
    boolean isEven(int x) {
        return (x%2 == 0);
    }

    public ListNode oddEvenList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode ptr = head;
        ListNode preptr = null;
        int i = 1;
        
        if(head == null) {
            return null;
        }

        while(ptr != null) {
            if(isEven(i)) {
                list.add(ptr.val);
                preptr.next = ptr.next;
                ptr = ptr.next;
            }
            else {
                preptr = ptr;
                ptr = ptr.next;
            }
            i++;
        }
        ptr = head;
        while(ptr.next != null) ptr = ptr.next;

        for(int x : list) {
            ListNode new_node = new ListNode(x);
            ptr.next = new_node;
            ptr = ptr.next;
        }

        return head;
    }
}