// Last updated: 7/9/2026, 11:46:59 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
        }
        return false;
    }
}