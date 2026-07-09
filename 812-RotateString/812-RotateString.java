// Last updated: 7/9/2026, 11:41:57 AM
class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
        return false;

        for(int i=0;i<s.length();i++)
        {
            s=s.substring(1)+s.charAt(0);

            if(s.equals(goal))
            return true;
        }
        return false;
    }
}