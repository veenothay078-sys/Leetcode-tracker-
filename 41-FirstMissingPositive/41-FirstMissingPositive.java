// Last updated: 7/9/2026, 12:28:21 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        int count=1;
        while(set.contains(count))
        count++;
        return count;
    }
}