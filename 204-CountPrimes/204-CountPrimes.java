// Last updated: 7/9/2026, 11:47:44 AM
class Solution 
{
    public int countPrimes(int vs) 
    {
      boolean sv[]=new boolean[vs];
      int s=0;
      for(int i=2;i<vs;i++)
      {
        if(!sv[i])
        {
            s++;
            for(int j=i*2;j<vs;j+=i)
            {
                sv[j]=true;
            }
           
        }

      }
      return s;

    
    }
    
}