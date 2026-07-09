// Last updated: 7/9/2026, 11:46:19 AM
class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        int[] result = new int[n + 1];

        for(int i = 0; i <= n ; i++){
            if(i % 2 == 0){
                result[i] = result[i / 2];
            }
            else{
                result[i] = result[i / 2] + 1;
            }
        }

        return result;
    }


}