// Last updated: 7/9/2026, 11:46:18 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        
        for(int i=0;i<16;i++)
        {
            if((int)Math.pow(4,i)==n)
            {
                return true;
            }
        }
        return false ;
        
    }
}