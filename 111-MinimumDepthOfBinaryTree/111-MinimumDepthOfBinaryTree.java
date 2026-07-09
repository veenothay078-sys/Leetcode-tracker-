// Last updated: 7/9/2026, 12:26:00 PM
class Solution {
    public int minDepth(TreeNode root) {
        // tree traversal
        // stack traversal
        // pseudocode 
        // tree has 3 edge cases - root null, leaf node, one child node missing
        
        // breaking point
        if(root == null) return 0;

        // leaf node
        if(root.left == null && root.right == null) return 1;

        // recursion for edge cases - if one of the nodes were missing
        if(root.left == null) return minDepth(root.right) + 1;
        if(root.right == null) return minDepth(root.left) + 1;

        // normal recursion - where both nodes are present
        int left =  minDepth(root.left);
        int right = minDepth(root.right);
    
        int minDepthAtNode = Math.min(left,right) + 1;
        return minDepthAtNode;
    }
}