// Last updated: 7/9/2026, 11:42:29 AM
class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int sum=0;
       int maxSum=0;
       for(int i=0;i<nums.length;i+=2)
       {
        maxSum+=nums[i];

       }
       return maxSum; 
    }
}