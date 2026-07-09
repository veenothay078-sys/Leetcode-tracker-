// Last updated: 7/9/2026, 11:41:35 AM
class Solution 
{
    public String removeStars(String s) 
    {
        StringBuilder v = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='*')
            {
                v.deleteCharAt(v.length()-1);
            }
            else
            {
                v.append(ch);
            }
        }
        return v.toString();
    }
}