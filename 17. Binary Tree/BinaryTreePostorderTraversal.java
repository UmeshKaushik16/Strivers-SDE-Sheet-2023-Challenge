import java.util.*;
public class BinaryTreePostorderTraversal {
    
public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<>();

        s1.push(root);

        while(!s1.isEmpty())
        {
            TreeNode cur = s1.pop();
            s2.push(cur);

            if(cur.left != null) s1.push(cur.left);
            if(cur.right != null) s1.push(cur.right);
        }

        while(!s2.isEmpty())
        {
            ans.add(s2.pop().val);
        }
        return ans;
    }
}
