// Last updated: 7/9/2026, 11:41:50 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        
        while(i<j)
        {
            if(nums[i]%2==0 || nums[i]==0)
            {
                i++;
            }
            if(nums[j]%2!=0)
            {
                j--;
            }
            else if(nums[i]%2!=0 && nums[j]%2==0)
            {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;

            }
            
        }
        return nums;
    }
}