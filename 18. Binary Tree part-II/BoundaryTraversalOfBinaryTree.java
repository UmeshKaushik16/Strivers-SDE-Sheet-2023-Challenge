import java.util.*;
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
public class BoundaryTraversalOfBinaryTree {
    
ArrayList <Integer> boundary(Node root)
	{
	    ArrayList <Integer> ans = new ArrayList<>();
	    
	   // if(root == null) return ans;
	    
	    if(isLeaf(root) == false) ans.add(root.data);
	    
	    addLeftBoundary(root,ans);
	    addLeaves(root,ans);
	    addRightBoundary(root,ans);
	    
	    return ans;
	}
	
	public boolean isLeaf(Node root)
	{
	    return (root.left == null) && (root.right == null);
 	}
 	
	public void addLeftBoundary(Node root,ArrayList <Integer> ans)
	{
	    Node cur = root.left;
	    
	    while(cur != null)
	    {
	        if(isLeaf(cur) == false) ans.add(cur.data); 
	        
	        if(cur.left != null) 
	        {
	            cur = cur.left;
	        }
	        else
	        {
	            cur = cur.right;
	        }
	    }
	}
	
	
	public void addLeaves(Node root,ArrayList <Integer> ans)
	{
	    if(isLeaf(root))
	    {
	        ans.add(root.data);
	        return;
	    }
	    
	    if(root.left != null) addLeaves(root.left,ans);
	    if(root.right != null) addLeaves(root.right,ans);
	}
	
	
	
	public void addRightBoundary(Node root,ArrayList <Integer> ans)
	{
	    Node cur = root.right;
	    ArrayList<Integer> lst = new ArrayList<>();
	    
	    while(cur != null)
	    {
	        if(isLeaf(cur) == false) lst.add(cur.data); 
	        
	        if(cur.right != null) 
	        {
	            cur = cur.right;
	        }
	        else
	        {
	            cur = cur.left;
	        }
	    }
	    
	    for(int i =lst.size()-1;i>=0;i--)
	        {
	            ans.add(lst.get(i));
	        }
	}
}
