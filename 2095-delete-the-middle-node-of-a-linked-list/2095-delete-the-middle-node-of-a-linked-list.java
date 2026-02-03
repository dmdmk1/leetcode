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
        ListNode copy = head;
        int size = 0;
        
        while(copy != null) {
            copy = copy.next;
            size++;
        }

        int n = size / 2;
        if (n == 0) {
            return head.next;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        int i = 0;
        while (curr != null && i < n) {
            if(i == n - 1) {
                prev.next = curr.next;
                break;
            }

            prev = prev.next;
            curr = curr.next;
            i++;
        }

        return head;
    }
}