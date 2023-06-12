public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=0;i<n;i++)
        {
            slow = slow.next;
        }

        while(slow.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = fast.next.next;

        return dummy.next;
        
    }
}
