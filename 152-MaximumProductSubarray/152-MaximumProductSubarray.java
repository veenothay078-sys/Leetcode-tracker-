// Last updated: 7/9/2026, 11:48:45 AM
class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
       int max=nums[0];
       int product=1;
       for(int i=0;i<n;i++)
       {
        product*=nums[i];
        max=Math.max(max,product);
        if(product==0)
        product=1;
       } 
       product=1;
       for(int i=n-1;i>=0;i--)
       {
        product*=nums[i];
        max=Math.max(max,product);
        if(product==0)
        product=1;
       }
       return max;
    }
}