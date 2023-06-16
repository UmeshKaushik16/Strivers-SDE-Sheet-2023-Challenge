public class ReverseNodesInKGroup {
    
    public int countNode(ListNode head)
    {
        int cnt = 0;
        ListNode temp = head;

        while(temp != null) 
        {
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        int length = countNode(head);

        return reverseKGroup(head, k,length);
        
    }

    public ListNode reverseKGroup(ListNode head, int k, int length)
    {
        if(length < k)
        {
            return head;
        }

        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;
        int count = 0;
        while(cur != null && count < k)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }

        if(next != null)
        {
            head.next = reverseKGroup(next,k,length - k);
        }

        return prev;
    }
}





