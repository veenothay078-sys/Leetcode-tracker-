// Last updated: 7/9/2026, 12:29:35 PM
class Solution {

    public static boolean isPalindromic(String s){
        int n=s.length();

        int left=0, right=n-1;

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }


    public String longestPalindrome(String s) {
        int n=s.length();

        String max = s.charAt(0)+"";

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(isPalindromic(s.substring(i,j))){
                    String str = s.substring(i,j);
                    max = (str.length() >= max.length()) ? str : max;
                    // OR
                    // if(str.length() >= max.length()){
                    //     max=str;
                    // }
                }
            }
        }
        return max;
    }
}