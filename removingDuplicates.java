import java.util.Stack;

class removingDuplicates {
	    public String removeDuplicates(String str) {
	        char[] ch = str.toCharArray();
	        Stack<Character> s=new Stack<>();
	        for(int i=ch.length-1;i>=0;i--){
	            if(s.isEmpty())
	                s.push(ch[i]);
	            else{
	                if(s.peek()==ch[i]){
	                    while(s.size()>0 && s.peek()==ch[i])
	                        s.pop();
	                }
	                else
	                    s.push(ch[i]);
	                }
	            }
	        String nstr="";
	        while(s.size()>0){
	             char c=s.pop();
	            nstr=nstr+c;
	        }
	           return nstr;
	        
	        }
	    }

