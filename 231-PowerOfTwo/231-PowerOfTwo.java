// Last updated: 7/9/2026, 11:46:45 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        for(int i=0;i<31;i++)
        {
            if((int)Math.pow(2,i)==n)
            {
                return true;
            }
        }
        return false ;
        
    }
}