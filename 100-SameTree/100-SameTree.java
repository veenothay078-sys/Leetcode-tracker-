// Last updated: 7/9/2026, 12:26:28 PM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==q && q==p)
        return true;
        if(p==null || q==null)
        return false;
        if(p.val!=q.val)
        return false;
        return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
        
    }
}