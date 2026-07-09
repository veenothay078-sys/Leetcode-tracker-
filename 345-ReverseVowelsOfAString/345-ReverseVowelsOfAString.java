// Last updated: 7/9/2026, 11:46:14 AM
public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            
            while (left < right && !isVowel(chars[left])) 
            left++;
            
            while (left < right && !isVowel(chars[right])) 
            right--;
            
            char temp = chars[left]; 
            chars[left++] = chars[right]; 
            chars[right--] = temp;
        }
        
        return new String(chars);
    }
    
    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}