// Last updated: 7/11/2026, 4:26:33 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        ArrayList<Integer> list = new ArrayList<>();
5
6        for (int x : nums1)
7            map.put(x, map.getOrDefault(x, 0) + 1);
8
9        for (int x : nums2) {
10            if (map.getOrDefault(x, 0) > 0) {
11                list.add(x);
12                map.put(x, map.get(x) - 1);
13            }
14        }
15
16        int[] ans = new int[list.size()];
17        for (int i = 0; i < list.size(); i++)
18            ans[i] = list.get(i);
19
20        return ans;
21    }
22}