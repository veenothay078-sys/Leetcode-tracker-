// Last updated: 7/9/2026, 11:41:33 AM
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int counter=0;
        for(int i=0;i<nums.length;i++)
        {
            seen.put(nums[i],i);
        }
        for(int num : nums)
        {
            if(seen.containsKey(num + diff) && seen.containsKey(num + 2 * diff))
            {
                counter++;
            }
        }
        return counter;
    }
}