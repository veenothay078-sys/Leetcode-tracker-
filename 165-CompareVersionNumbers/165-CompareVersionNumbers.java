// Last updated: 7/9/2026, 11:48:32 AM
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\."); //  n = length of this string
        String[] v2 = version2.split("\\."); //  m = length of this string
        
        int n = v1.length;
        int m = v2.length;

        int maxLen = Math.max(n,m); // We go till the longest length so that every pair will cover.

        for(int i = 0; i < maxLen; i++){
            // Its finds value till "i < length of arr" to prevent indexOutOfBound,  otherwise takes 0 as a value.
            int num1 = i < n ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < m ? Integer.parseInt(v2[i]) : 0;

            // Comareing according to the question
            if(num1 > num2) return 1;
            if(num1 < num2) return -1;
        }

        return 0; // If above not returned then this will returned.
    }
}