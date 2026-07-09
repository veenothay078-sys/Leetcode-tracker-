// Last updated: 7/9/2026, 11:48:59 AM
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postorder(root,l);
        return l;
    }
    void postorder(TreeNode root,List<Integer> l)
    {
        if(root==null)
        return;
        postorder(root.left,l);
        postorder(root.right,l);
        l.add(root.val);
    }
}