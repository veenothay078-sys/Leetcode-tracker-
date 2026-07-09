// Last updated: 7/9/2026, 11:45:56 AM
public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        boolean firstCap = word.charAt(0) <= 'Z';
        boolean allCaps = firstCap;
        
        for (int i = 1; i < word.length(); i++) {
            boolean isCap = word.charAt(i) <= 'Z';
            if (i == 1 && !firstCap && isCap) return false;
            if (i > 1 && allCaps != isCap) return false;
            allCaps = allCaps && isCap;
        }
        
        return true;
    }
}