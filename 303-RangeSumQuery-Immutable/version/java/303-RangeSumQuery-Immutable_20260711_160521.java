// Last updated: 7/11/2026, 4:05:21 PM
1class NumArray {
2    int[] pre;
3
4    public NumArray(int[] nums) {
5        pre = new int[nums.length + 1];
6        for (int i = 0; i < nums.length; i++)
7            pre[i + 1] = pre[i] + nums[i];
8    }
9
10    public int sumRange(int left, int right) {
11        return pre[right + 1] - pre[left];
12    }
13}