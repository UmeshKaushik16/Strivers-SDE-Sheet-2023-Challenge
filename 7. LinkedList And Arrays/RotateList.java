public class RotateList {
    
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k==0)return head;

        ListNode temp = head;
        int size = 0;

        while(temp.next != null)
        {
            size++;
            temp = temp.next;
        }
        size++;
        temp.next = head;

        k = k % size;
        k = size - k;

        while(k > 0)
        {
            temp = temp.next;
            k--;
        }

        head = temp.next;
        temp.next = null;

        return head;

        
    }
}
