// Last updated: 7/9/2026, 11:46:00 AM
public class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                i++;
                count++;
            }
            chars[j++] = ch;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[j++] = c;
                }
            }
        }
        return j;
    }
}
