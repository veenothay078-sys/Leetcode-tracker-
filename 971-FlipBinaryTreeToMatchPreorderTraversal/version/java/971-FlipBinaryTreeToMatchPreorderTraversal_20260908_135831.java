// Last updated: 9/8/2026, 1:58:31 PM
1class Solution {
2    int idx=0;
3    List<Integer> ans;
4    public List<Integer> flipMatchVoyage(TreeNode root, int[] arr) {
5        ans=new ArrayList<>();
6        if(sol(root,arr)) return ans;
7        return Arrays.asList(-1);
8    }
9    public boolean sol(TreeNode root,int[] arr){
10        if(root==null) return true;
11        if(root.val!=arr[idx]) return false;
12        idx++;
13        if(root.left!=null && root.left.val!=arr[idx]){
14            ans.add(root.val);
15            return sol(root.right,arr) && sol(root.left,arr);
16        }
17        return sol(root.left,arr) && sol(root.right,arr);
18    }
19}