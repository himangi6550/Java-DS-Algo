
public class Palindrome {
	public static int isPalindrome(String A) {
		A=A.toUpperCase();
        char ch[]=A.toCharArray();
        int j=ch.length-1,flag=1;
        for(int i=0;i<ch.length/2 || j>ch.length/2;){
            int n=(int)ch[i];
            
            int m=(int)ch[j];
            
            System.out.println(i+" "+ch[i]+" "+ch[j]+" "+j);
            if(ch[i]==ch[j]) {
            	i++;j--;
            }
            else if((!(n>=65 && n<=90) && !(n>=97 && n<=122) && !(n>=48 && n<=57)))
            	i++;
            else if(!((m>=65 && m<=90)||(m>=97 && m<=122)||(m>=48 && m<=57)))
            	j--;
            else 
            {
            	flag=0;break;
            }
            
               
            
            

        }
        return flag;
    }
	public static void main(String args[]) {
		String str="A man, a plan, a canal: Panama";
		int n=isPalindrome(str);
		if(n==0)
			System.out.print("false");
		else
			System.out.print("true");
	}

}
