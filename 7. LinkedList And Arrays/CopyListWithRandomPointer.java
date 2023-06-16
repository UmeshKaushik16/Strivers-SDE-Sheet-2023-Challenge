public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        if(head==null) return null;

        Node cur = head;

        while(cur != null)
        {
            Node temp = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = temp;
            cur = temp;
        }

        cur = head;

        while(cur != null)
        {
            cur.next.random = cur.random == null? null:cur.random.next;
            cur = cur.next.next;
        }

        Node org = head;
        Node copy = head.next;
        Node temp = copy;

        while(org != null)
        {
            org.next = org.next.next;
            copy.next = copy.next == null? null:copy.next.next;
            org = org.next;
            copy = copy.next; 
        }
        
        return temp;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}