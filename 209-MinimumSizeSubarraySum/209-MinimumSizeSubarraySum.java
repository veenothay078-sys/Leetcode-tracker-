// Last updated: 7/9/2026, 11:47:20 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0, sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while(sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}