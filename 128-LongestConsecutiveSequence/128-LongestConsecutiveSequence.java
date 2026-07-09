// Last updated: 7/9/2026, 11:59:38 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int current=num;
                int len=0;
                while(set.contains(current))
                {
                    len++;
                    current++;
                }
                length=Math.max(len,length);
            }
        }
        return length;
    }
}