// Last updated: 7/9/2026, 11:42:31 AM
class Solution {

    public String reverseWords(String s) {

        String[] sv = s.split(" ");

        String vs = "";

        for(String v : sv) {

            String t = "";

            for(int i = v.length() - 1; i >= 0; i--) {
                t += v.charAt(i);
            }

            vs += t + " ";
        }

        return vs.trim();
    }
}