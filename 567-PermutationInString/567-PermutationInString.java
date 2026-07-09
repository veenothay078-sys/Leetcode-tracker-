// Last updated: 7/9/2026, 11:42:25 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) 
        return false;
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        s1 = new String(arr1);
        for(int i=0; i<=s2.length() - s1.length(); i++){
            String str = s2.substring(i, i+s1.length());
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            str = new String(arr);
            if(s1.equals(str))
                return true;
        }

        return false;
    }
}