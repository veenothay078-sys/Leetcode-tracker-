// Last updated: 7/9/2026, 11:46:05 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0; // pointer for s
        int tp = 0; // pointer for t

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++; // move both pointers if there's a match
            }
            tp++; // always move tp
        }

        return sp == s.length(); // true if all characters in s are found
    }
}