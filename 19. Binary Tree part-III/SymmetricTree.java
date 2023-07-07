public class SymmetricTree {
    
public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

        return isSymmetric(root.left, root.right);
        
    }

    public boolean isSymmetric(TreeNode head1, TreeNode head2)
    {
        if(head1 == null && head2 == null) return true;
        else if(head1 == null || head2 == null) return false;

        return (head1.val == head2.val) && 
        isSymmetric(head1.left,head2.right) &&
        isSymmetric(head1.right,head2.left);
    }
}