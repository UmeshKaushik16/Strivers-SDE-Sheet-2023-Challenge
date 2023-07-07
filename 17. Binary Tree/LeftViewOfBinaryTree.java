import java.util.*;
public class LeftViewOfBinaryTree {
    
ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        leftView(root, ans, 0);
        
        return ans;
    }
    
    
    public void leftView(Node root, ArrayList<Integer> ans, int lvl)
    {
        if(root == null)
        {
            return;
        }
        
        if(ans.size() == lvl)
        {
            ans.add(root.data);
        }
        
        leftView(root.left, ans, lvl+1);
        leftView(root.right, ans, lvl+1);
    }
}


