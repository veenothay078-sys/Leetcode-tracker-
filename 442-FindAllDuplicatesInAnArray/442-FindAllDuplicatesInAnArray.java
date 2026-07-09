// Last updated: 7/9/2026, 11:46:01 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            n.add(nums[i-1]);
        }
        return n;
    }
}