class Reverse {
    public String reverseWords(String s) {
        String nstr="";int i;

        for(i=s.length()-1;i>=0;i--){
            
             while(i>=0 && s.charAt(i)==' ') i--;
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ') i--;
        
            if(nstr==""){
                nstr=nstr.concat(s.substring(i+1,j+1));
            }
           else{
               nstr=nstr.concat(" "+s.substring(i+1,j+1));
           }
            
            
           
        }
        return nstr;
    }
}
public class ReverseString {
	public static void main(String args[]) {
		Reverse s=new Reverse();

		String reversedstring=s.reverseWords("  Bob    Loves  Alice   ");
		System.out.println(reversedstring);
		}

}
