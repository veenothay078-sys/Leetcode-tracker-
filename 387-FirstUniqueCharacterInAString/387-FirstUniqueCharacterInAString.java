// Last updated: 7/9/2026, 11:46:07 AM
class Solution 
{
    public int firstUniqChar(String s) 
    {
        if(s.length()==1)
        {
            return 0;
        }
        int flag=0;
        for(int i=0;i<s.length()-1;i++)
        {
            flag=0;
           for(int j=0;j<s.length();j++) 
           {
                if(s.charAt(i)==s.charAt(j) && i!=j)
                {
                    flag=1;
                    break;
                }
           }
           if(flag==0)
           {
              return i;
           }
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==(s.charAt(s.length()-1)))
            {
                return -1;
            }
        }
        return s.length()-1;
    }
}