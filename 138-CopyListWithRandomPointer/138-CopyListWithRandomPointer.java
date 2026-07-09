// Last updated: 7/9/2026, 11:49:22 AM
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        // if(head.next==null) return new Node(head.val);
        Node temp = head;
        while(temp!=null)
        {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }
        Node prev = head;
        temp = head.next;
        int count =1;
        while(temp!=null)
        {
            temp.random = (prev.random==null)?null:prev.random.next;
            prev = temp.next;
            temp = (prev!=null)?prev.next:null;
        }
        Node res = new Node(-1);
        Node res2 = res;
        temp = head;
        count = 1;
        Node odd = new Node(-1);
        while(temp!=null)
        {
            if(count%2==0)
            {
                res.next = temp;
                res = temp;
                temp = temp.next;
                res.next = null;
            }
            else
            {
                odd.next=temp;
                odd = temp;
                temp = temp.next;
                odd.next = null;

            }
            count++;
            // temp = temp.next;
        }
        return res2.next;
    }
}