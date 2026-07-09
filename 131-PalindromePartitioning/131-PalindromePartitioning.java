// Last updated: 7/9/2026, 11:59:35 AM
class Solution {
    List<List<String>> ans = new ArrayList<>();

    public boolean isPalindrom(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            end--;
            start++;
        }
        return true;
    }

        public void helper(String s, List<String> lst) { // lst store curr element
        if(s.length() == 0) {
            if(lst.size() > 0) ans.add(lst);
            return;
        }

        for(int i = 0; i < s.length(); i++) {
            if(isPalindrom(s.substring(0, i+1))){
                List<String> copy = new LinkedList<>(lst);
                copy.add(s.substring(0, i+1));
                helper(s.substring(i+1), copy);
            }
        }
    }
    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        helper(s, new LinkedList<>());
        return ans;
    }
}