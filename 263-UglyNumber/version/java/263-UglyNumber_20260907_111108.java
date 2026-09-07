// Last updated: 9/7/2026, 11:11:08 AM
1class Solution {
2    public boolean isUgly(int n) {
3       
4        if(n<=0) return false;
5        while (n%2==0) n/=2;
6        while(n%3==0) n/=3;
7        while(n%5==0) n/=5;
8        return n==1;
9    }
10}