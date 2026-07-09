// Last updated: 7/9/2026, 11:48:54 AM
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { 
        val = x; 
    }

    
    public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty() || data.equals("[]")) return null;
        
        String[] values = data.replaceAll("[\\[\\] ]", "").split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }

        return dummy.next; 
    }
}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted = new ListNode(0); 
        while (head != null) {
            ListNode current = head;
            head = head.next;

            ListNode prev = sorted;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;
        }

        return sorted.next; 
    }
}

public class Main {
    public static void main(String[] args) {
        String input = "[4,2,1,3]";
        ListNode head = ListNode.deserialize(input);
        
        Solution solution = new Solution();
        ListNode sortedHead = solution.insertionSortList(head);
        
        while (sortedHead != null) {
            System.out.print(sortedHead.val + " ");
            sortedHead = sortedHead.next;
        }
    }
}
