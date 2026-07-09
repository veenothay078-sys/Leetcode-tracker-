// Last updated: 7/9/2026, 11:49:13 AM
class Solution {
    boolean vis[];
    List<String> res;

    private boolean segregate(String s, int st, Set<String> dict, String str) {
        if(st == s.length()) {
            res.add(str);
            return true;
        }
        if(vis[st]) return false;
        boolean flag = false;

        // System.out.println(st);
        for(int i=st;i<s.length();i++) {
            String sub = s.substring(st, i+1);
            if(dict.contains(sub)) {
                flag = segregate(s, i +1, dict, (str.equals(""))?sub:(str + " " + sub)) || flag;
            }
        }

        if(!flag) vis[st] = true;
        return flag;
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        vis = new boolean[s.length()];
        res = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);

        segregate(s, 0, dict, "");
        return res;
    }
}