// Last updated: 7/9/2026, 12:28:26 PM
public class Solution 
{
    public String countAndSay(int n) 
    {
	    	StringBuilder curr=new StringBuilder("1");
	    	StringBuilder prev;
	    	int c;
	    	char say;
	        for (int i=1;i<n;i++){
	        	prev=curr;
	 	        curr=new StringBuilder();       
	 	        c=1;
	 	        say=prev.charAt(0);
	 	        
	 	        for (int j=1,len=prev.length();j<len;j++)
                {
	 	        	if (prev.charAt(j)!=say){
	 	        		curr.append(c).append(say);
	 	        		c=1;
	 	        		say=prev.charAt(j);
	 	        	}
	 	        	else c++;
	 	        }
	 	        curr.append(c).append(say);
	        }	       	        
	        return curr.toString();
        
    }
}