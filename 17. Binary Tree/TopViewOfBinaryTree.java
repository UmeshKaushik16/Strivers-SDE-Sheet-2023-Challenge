import java.util.*;
public class TopViewOfBinaryTree
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,root));
        
        Map<Integer,Integer> map = new TreeMap<>();
        
        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            
            map.putIfAbsent(cur.hd,cur.node.data);
            
            if(cur.node.left != null)
            {
                q.add(new Pair(cur.hd-1, cur.node.left));
            }
            
            if(cur.node.right != null)
            {
                q.add(new Pair(cur.hd+1, cur.node.right));
            }
        }
        
        Collection<Integer> values = map.values();
        
        ArrayList<Integer> ans = new ArrayList<>(values);
        
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

