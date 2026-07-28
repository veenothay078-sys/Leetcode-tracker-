// Last updated: 7/28/2026, 2:47:34 PM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] lastIndex = new int[26];
4        for (int i = 0; i < s.length(); i++){
5            lastIndex[s.charAt(i) - 'a'] = i; 
6        }
7        
8        boolean[] seen = new boolean[26]; 
9        Stack<Integer> st = new Stack();
10        
11        for (int i = 0; i < s.length(); i++) {
12            int curr = s.charAt(i) - 'a';
13            if (seen[curr]) continue;
14            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
15                seen[st.pop()] = false; 
16            }
17            st.push(curr); 
18            seen[curr] = true; 
19        }
20
21        StringBuilder sb = new StringBuilder();
22        while (!st.isEmpty())
23            sb.append((char) (st.pop() + 'a'));
24        return sb.reverse().toString();
25    }
26}