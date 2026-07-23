// Last updated: 7/23/2026, 2:48:20 PM
1import java.util.*;
2
3class Solution {
4    public boolean canPartition(int[] nums) {
5        int sum = 0, n = nums.length;
6        
7        for (int i = 0; i < n; i++)
8            sum += nums[i];
9        
10        if (sum % 2 != 0) 
11            return false;
12
13        boolean[] dp = new boolean[10001];
14        dp[0] = true;
15        for (int num : nums) {
16            for (int j = 10000; j >= num; j--) {
17                dp[j] = dp[j] || dp[j - num];
18            }
19            if (dp[sum / 2]) 
20                return true;
21        }
22        return dp[sum / 2];
23    }
24}