public class PalindromeLinkedList {
    
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;

        while(slow!=null)
        {
            if(head.val != slow.val) return false;

            head = head.next;
            slow = slow.next;
        }

        return true;
        
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while(cur!=null)
        {
            next = cur.next;
            cur.next = prev;
            prev= cur;
            cur = next;
        }

        return prev;
    }
}

