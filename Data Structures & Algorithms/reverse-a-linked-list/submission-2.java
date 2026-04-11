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
    public ListNode reverseList(ListNode head) {
        // so given a linked list reverse it//
        //thought process is u start at head and then u put the next in a new one?
        //lets say the first one is recursion go down the rabbit hole and keep appending ig
        if(head == null){
            return null;
        }

        ListNode newHead = head;
        if(head.next!= null){
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;

        
    }
}
