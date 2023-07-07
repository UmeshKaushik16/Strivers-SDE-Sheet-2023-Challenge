import java.util.*;
public class MaximumWidthOfBinaryTree {
    
public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int maxWidth = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            
            int min = q.peek().idx;
            int first = 0,last = 0; 
            for(int i=0;i<size;i++)
            {
                int cur_idx = q.peek().idx - min;
                TreeNode node = q.peek().node;
                q.poll();

                if(i == 0) first = cur_idx;
                if(i == size-1) last = cur_idx;

                if(node.left != null) 
                {
                    q.add(new Pair(node.left,cur_idx*2+1));
                }

                if(node.right != null) 
                {
                    q.add(new Pair(node.right, cur_idx*2+2));
                }
            }

            maxWidth = Math.max(maxWidth, last-first+1);

        }
        return maxWidth;
    }
}

class Pair
{
    TreeNode node;
    int idx;

    public Pair(TreeNode node, int idx)
    {
        this.node=node;
        this.idx=idx;
    }

}






