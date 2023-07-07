import java.util.*;
public class BinaryTreeZigzagLevelOrderTraversal {
    
 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        boolean flag = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> lst = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode cur = q.poll();

                if(flag == true)
                {
                    lst.add(cur.val);
                }
                else
                {
                    lst.add(0,cur.val);
                }

                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }

            flag = !flag;

            ans.add(lst);
            
        }

        return ans;
    }
}

