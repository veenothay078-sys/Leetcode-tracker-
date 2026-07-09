// Last updated: 7/9/2026, 11:49:40 AM
class Solution {
    public int singleNumber(int[] nums) {
      int result=0;
      for(int n : nums)
      {
        result^=n;
      }  
      return result;
    }
}