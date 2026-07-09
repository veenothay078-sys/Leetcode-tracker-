// Last updated: 7/9/2026, 12:26:19 PM
class Solution {
    int maxDepth = 0;

    private void recursiveFun(TreeNode root, int depth){
        if(root == null){
            maxDepth = Math.max(depth, maxDepth);
            return;
        }

        recursiveFun(root.left, depth+1);
        recursiveFun(root.right, depth+1);
    }


    public int maxDepth(TreeNode root) {
        recursiveFun(root, 0);
        return maxDepth;
    }
}