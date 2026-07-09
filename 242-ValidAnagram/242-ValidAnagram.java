// Last updated: 7/9/2026, 11:46:40 AM
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
       char[] vt = t.toCharArray();
       Arrays.sort(vt);
       String s1 = new String(charArray);
        String s2 = new String(vt);
        if(s1.equals(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
}}