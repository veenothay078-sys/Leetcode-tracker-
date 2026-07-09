// Last updated: 7/9/2026, 12:28:38 PM
class Solution {
    int longestValidParentheses(String s) {
        int max = 0, l = 0, r = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') l++; else r++;
            if (l == r) max = Math.max(max, 2 * r);
            if (r > l) l = r = 0;
        }
        l = r = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') l++; else r++;
            if (l == r) max = Math.max(max, 2 * l);
            if (l > r) l = r = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestValidParentheses("(()"));
    }
}