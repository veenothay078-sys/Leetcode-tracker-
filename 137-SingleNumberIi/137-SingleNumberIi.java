// Last updated: 7/9/2026, 11:49:33 AM
class Solution {
    public int singleNumber(int[] nums) {
        int answer=0;
        for(int i=0;i<32;i++)
        {
            int sum=0;
            for(final int num : nums)
               sum+=num>>i&1;
               sum%=3;
               answer|=sum << i;
        }
        return answer;
    }
}