// Last updated: 7/9/2026, 11:41:46 AM
class Solution {
    public String reverseOnlyLetters(String s){
        char c[]=s.toCharArray();
        int l=0,e=c.length-1;
        while(l<e)
        {
            if(!Character.isLetter(c[l]))
            {
                l++;
            }
            else if(!Character.isLetter(c[e]))
            {
                e--;
            }
            else
            {
                char t=c[l];
                c[l]=c[e];
                c[e]=t;
                l++;
                e--;

            }
        }
        return new String(c);
    }  
    
}