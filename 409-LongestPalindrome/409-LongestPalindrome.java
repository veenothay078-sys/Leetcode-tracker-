// Last updated: 7/9/2026, 11:46:03 AM
class Solution {
    public int longestPalindrome(String s) {
      int[] arr=new int[128];
      boolean isOdd = false;
      int result=0;
      for(char ch : s.toCharArray())
      {
        arr[ch]++;
      }  
      for(int count : arr)
      {
        if(count%2==0)
        result += count;
        else
        {
            isOdd=true;
            result+=count-1;
        }
      }
      if(isOdd)
      result+=1;
      return result;
    }
}