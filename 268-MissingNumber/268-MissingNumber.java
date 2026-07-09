// Last updated: 7/9/2026, 11:46:37 AM
class Solution {
    public int missingNumber(int[] nums) {
       int result=nums.length;
       for(int i=0;i<nums.length;i++)
       {
        result += i-nums[i];
       } 
       return result;
    }
}