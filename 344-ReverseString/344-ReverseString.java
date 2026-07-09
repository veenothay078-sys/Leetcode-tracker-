// Last updated: 7/9/2026, 11:46:16 AM
class Solution 
{
    public void reverseString(char[] sv) 
    {
        int s=0;
        int v=sv.length-1;
        while(s<v)
        {
            char vs=sv[s];
            sv[s]=sv[v];
            sv[v]=vs;
            s++;
            v--;
        }
    }
}