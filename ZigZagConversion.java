class ZigZag {
    public String convert(String s, int numRows) {
        if(s.length()<3 || numRows==1)
            return s;
        int p=0,j=0;String ans="";
        String[] v=new String[numRows];
        for(int k=0;k<numRows;k++){
            v[k]="";
        }
        for(int i=0;i<s.length();i++){
            if(p==0){
                while(i<s.length() && j<numRows){
                    
                    v[j]=v[j]+s.charAt(i);
                    //System.out.println(v[j]);
                    i++;j++;
                    p=1;
                }
                j=j-2;
            }
            if(p==1){
                while(i<s.length() && j>=0){
                    v[j]=v[j]+s.charAt(i);
                    //System.out.println(v[j]);
                    i++;j--;
                    p=0;
                }
                j=j+2;i--;
            }
        }
        for(int k=0;k<numRows;k++){
            //System.out.println(v[k]);
            ans=ans+v[k];
        }
        return ans;
    }
}
public class ZigZagConversion {
	public static void main(String args[]) {
		ZigZag s=new ZigZag();
		String convertedstring=s.convert("Bob Loves Alice",5);
		System.out.println(convertedstring);
		}

}
