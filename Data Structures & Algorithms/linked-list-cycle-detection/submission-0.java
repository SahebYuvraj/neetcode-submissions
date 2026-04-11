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
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> seen = new HashSet<>();
        ListNode curr = head;

        // basically if there is a rep then return true

        while(curr!=null){
            if(seen.contains(curr)){return true;}
            seen.add(curr);
            curr = curr.next;
        }
        return false;
        
    }
}
