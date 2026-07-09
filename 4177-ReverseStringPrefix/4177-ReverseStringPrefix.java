// Last updated: 7/9/2026, 11:41:38 AM
class Solution 
{
    public String reversePrefix(String s, int v) 
    {
        String t="";
        for(int i=v-1;i>=0;i--)
        {
            t+=s.charAt(i);
        }
        for(int i=v;i<s.length();i++)
        {
            t+=s.charAt(i);
        }
        return t;
    }
}