public class DiameterOfBinaryTree {
    
 public int diameterOfBinaryTree(TreeNode root) {

        int max[] = new int[1];

        findMaxDia(root,max);
        return max[0];
        
    }

    public int findMaxDia(TreeNode root, int max[])
    {
        if(root == null) return 0;

        int left = findMaxDia(root.left,max);
        int right = findMaxDia(root.right,max);

        max[0] = Math.max(max[0],left+right);

        return 1 + Math.max(left,right);
    }
}