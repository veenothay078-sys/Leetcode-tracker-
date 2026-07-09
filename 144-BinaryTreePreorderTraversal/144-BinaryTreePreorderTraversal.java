// Last updated: 7/9/2026, 11:49:01 AM
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preorder(root,l);
        return l;
    }
    void preorder(TreeNode root,List<Integer> l)
    {
        if(root==null)
        return;
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);
       
    }
}