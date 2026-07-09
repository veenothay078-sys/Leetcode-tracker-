// Last updated: 7/9/2026, 12:27:50 PM
class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int length = 0;
		
        for (int i = s.length() - 1; i >= 0; i--) 
        {

            if (s.charAt(i) != ' ') 
            { 
                length++;
            } 
            else
            {
                if(length>0)
                return length;
            
            }
        }
        return length;
    }
}





























