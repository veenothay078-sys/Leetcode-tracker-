// Last updated: 7/9/2026, 12:28:59 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If either list is empty, return the other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Merge the two lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // Append the remaining nodes from the non-empty list
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        // Return the head of the merged list
        return dummy.next;
    }
}
