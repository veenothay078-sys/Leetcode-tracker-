// Last updated: 7/9/2026, 12:27:45 PM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;
        
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        
        
        int rotation = k % length;

        // Step 3: Perform the rotation for 'rotation' times
        for(int i = 0; i < rotation; i++) {
            ListNode last = head, prev = null;
            
            // Step 4: Traverse the list to find the last node
            while(last.next != null) {
                prev = last;
                last = last.next;
            }
            
            // Step 5: Perform the rotation by adjusting pointers
            last.next = head;
            prev.next = null;
            head = last;
        }
        
        return head;
    }
}