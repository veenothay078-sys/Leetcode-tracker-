// Last updated: 7/9/2026, 12:27:35 PM
class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
       int flag=0;
       int i=a.length()-1;
       int j=b.length()-1;
       while(i>=0 || j>=0 || flag==1)
       {
        if(i>=0)
        flag += a.charAt(i--)-'0';
        if(j>=0)
        flag += b.charAt(j--)-'0';
        sb.append(flag%2);
        flag/=2;
       }
       return sb.reverse().toString(); 
    }
}