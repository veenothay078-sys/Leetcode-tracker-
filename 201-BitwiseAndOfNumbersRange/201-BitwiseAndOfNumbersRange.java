// Last updated: 7/9/2026, 11:47:54 AM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt=0;
        while(left != right)
        {
            left >>=1;
            right >>= 1;
            cnt++;
        }
        return(left<<cnt);
    }
}