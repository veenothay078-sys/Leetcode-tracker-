// Last updated: 7/9/2026, 11:41:41 AM
class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
         int actualcount=0;
            int count=0;
            int num;
        for(int i=0;i<n;i++)
        {
             count=0;
            num=nums[i];
            while(num>0)
            {
                num=num/10;
                count++;
            }
            if(count%2==0)
            {
                actualcount++;
            }
        }
        return actualcount;
    }
}