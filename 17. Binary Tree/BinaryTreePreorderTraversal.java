import java.util.*;
public class BinaryTreePreorderTraversal {
    
public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        s.add(root);

        while(!s.isEmpty())
        {
            TreeNode cur = s.pop();
            ans.add(cur.val);

            if(cur.right != null)
            {
                s.push(cur.right);
            }

            if(cur.left != null)
            {
                s.push(cur.left);
            }
            
        }

        return ans;
    }
}

