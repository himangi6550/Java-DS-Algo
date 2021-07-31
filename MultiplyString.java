class MultiplyString {
    public int multiply(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        int i;
        int k=l1+l2-1;int pos=k;
        int carry=0;int j;
        int[] res=new int[l1+l2];
        for(int l=0;l<l1+l2;l++)
            res[l]=0;
        for(i=l2-1;i>=0;i--) {
        	carry=0;
            for(j=l1-1;j>=0;j--){
            	System.out.println(num2.charAt(i) +" "+num1.charAt(j));
                int n1=Character.getNumericValue(num2.charAt(i));
                int n2=Character.getNumericValue(num1.charAt(j));
                int pr=(n1*n2)+carry+res[k];
                
                 res[k]=pr%10;
                carry=pr/10;
                System.out.println("product:"+pr +" carry:"+carry);
                k--;
            }
            if(j<0 && carry>0)
                {
            	res[k]=carry;System.out.println("k:"+k +" carry:"+carry);
                }
            pos--;
            k=pos;
            System.out.println("k:"+k);
            
        }
        int op=0;
        for(int p=0;p<l1+l2;p++) {
        	op=op*10+res[p];
        }
        return op;
    }
    public static void main(String args[]) {
    	MultiplyString s=new MultiplyString();

		int p=s.multiply("207","509");
		
		System.out.println(p);
		}
}

