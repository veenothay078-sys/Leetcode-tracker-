// Last updated: 7/9/2026, 12:27:32 PM
class Solution {
    public int mySqrt(int x) {
        int count = 0;
        for(int i=1; i<=x/i; i++){
            count++;
        }
        return count;
    }
}