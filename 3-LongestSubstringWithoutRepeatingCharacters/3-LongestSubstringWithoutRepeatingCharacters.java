// Last updated: 7/9/2026, 12:29:40 PM
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       int v=0;
       for(int i=0;i<s.length();i++)
       {
        HashSet<Character> sv = new HashSet<>();
        for(int j=i;j<s.length();j++)
        {
            if(sv.contains(s.charAt(j)))
            {
                break;
            }
            sv.add(s.charAt(j));
            v=Math.max(v,j-i+1);
       } 
       }
       return v;
    }
       
 }

