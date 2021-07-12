

class Length {
    public int lengthOfLastWord(String s) {
        String st=s;
        if(st.length()==0)
        return 0;
        int l=0,flag=0;
        for(int i=st.length()-1;i>=0;i--){
            
            char c=st.charAt(i);
            //System.out.println(c);
            if(c!=' '){
            
                l++;flag=1;
            }
            else {
                if(flag==1)
                    return l;
                
            }
                
            }
        
        return l;
    }
}

public class LengthofLastWord {
	public static void main(String args[]) {
		Length s=new Length();
	int len=s.lengthOfLastWord("Hello World");
	System.out.println(len);
	}
}