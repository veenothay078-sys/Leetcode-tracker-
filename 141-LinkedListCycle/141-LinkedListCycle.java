// Last updated: 7/9/2026, 11:49:05 AM
/**
 * class ListNode {
 *     int val;
 *     ListNode next;
 */


public class Solution {
    public boolean hasCycle(ListNode head) {
        // time : O(n), n = number of nodes to traverse through
        // space: O(1)

        //sf
        // 3 2 0 4    (4 -> 2)

        //   s f              f s                 sf
        // 3 2 0 4   ->     3 2 0 4    ->   3 2 0 4

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }
}