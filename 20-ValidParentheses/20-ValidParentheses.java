// Last updated: 7/9/2026, 12:29:02 PM
class Solution
 {
    public boolean isValid(String s) 
    {
        Stack<Character> s1=new Stack<>();
        for (char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            s1.push(ch);
            else if(ch==')'||ch=='}'||ch==']')
            {
                if(s1.isEmpty()||(ch==')'&&s1.pop()!='(')||(ch=='}'&&s1.pop()!='{')|| (ch==']'&&s1.pop()!='[' )) 
             return false;
            }
        } 
        return s1.isEmpty();
    }      
 }   