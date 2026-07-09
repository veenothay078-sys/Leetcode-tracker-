// Last updated: 7/9/2026, 11:47:13 AM
class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: Exclude last house
        int rob1 = robLinear(nums, 0, n - 2);

        // Case 2: Exclude first house
        int rob2 = robLinear(nums, 1, n - 1);

        return Math.max(rob1, rob2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}