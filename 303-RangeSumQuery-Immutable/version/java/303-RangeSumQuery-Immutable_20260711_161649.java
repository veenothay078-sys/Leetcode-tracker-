// Last updated: 7/11/2026, 4:16:49 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> s1 = new HashSet<>();
4        HashSet<Integer> ans = new HashSet<>();
5
6        for (int x : nums1) s1.add(x);
7        for (int x : nums2)
8            if (s1.contains(x))
9                ans.add(x);
10
11        int[] res = new int[ans.size()];
12        int i = 0;
13        for (int x : ans)
14            res[i++] = x;
15
16        return res;
17    }
18}