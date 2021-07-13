import java.util.Stack;

class Duplicates {
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
public class removingDuplicates {
	public static void main(String args[]) {
		Duplicates s=new Duplicates();
		String str=s.removeDuplicates("Looteraa");
		System.out.println(str);
		}

}


