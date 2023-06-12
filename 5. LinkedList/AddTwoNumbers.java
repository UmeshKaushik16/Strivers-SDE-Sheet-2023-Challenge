public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {

        
        int carry = 0;
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
       

        while(head1 != null || head2 != null || carry == 1)
        {
            int sum = 0;

            if(head1 != null)
            {
                sum += head1.val;
                head1 = head1.next;
            }
            
            if(head2 != null)
            {
                sum += head2.val;
                head2 = head2.next;
            }

            sum += carry;
            carry = sum/10;
            int digit = sum%10;

            ListNode newNode = new ListNode(digit);

            temp.next = newNode;
            temp = newNode;
        }
        
        return dummy.next;
    }
}