import java.util.*;
public class BottomViewofBinaryTree
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
      Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        
        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            
            map.put(cur.hd, cur.node.data);
            
            if(cur.node.left != null) q.add(new Pair(cur.hd-1, cur.node.left));
            
            if(cur.node.right != null) q.add(new Pair(cur.hd+1, cur.node.right));
        }
        
        Collection<Integer> lst = map.values();
        
        ArrayList<Integer> ans = new ArrayList<>(lst);
        
        return ans;
    }
}

class Pair
{
    int hd;
    Node node;
    
    public Pair(int hd, Node node)
    {
        this.hd=hd;
        this.node=node;
    }
}