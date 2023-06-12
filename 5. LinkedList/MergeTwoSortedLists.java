public class MergeTwoSortedLists {
    
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

        if(head1 == null) return head2;
        else if(head2 == null) return head1;

        ListNode mergeHead = null;

        if(head1.val > head2.val)
        {
            mergeHead = head2;
            head2 = head2.next;
        }
        else
        {
            mergeHead = head1;
            head1 = head1.next;
        }

        ListNode mergeTail = mergeHead;

        while(head1 != null && head2 != null)
        {
            ListNode temp = null;
            if(head1.val > head2.val)
            {
                temp = head2;
                head2 =head2.next;
            }
            else
            {
                temp = head1;
                head1 = head1.next;
            }

            mergeTail.next = temp;
            mergeTail = temp;
        }

        if(head1 != null)
        {
            mergeTail.next = head1;
        }

        if(head2 != null)
        {
            mergeTail.next = head2;
        }
        
        return mergeHead;
    }
}
