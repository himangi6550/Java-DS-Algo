class IntegertoRoman {
    public String intToRoman(int num) {
        String[] key={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String nstr="";
        for(int i=0;i<key.length;i++){
            while(num>=val[i]){
              num=num-val[i];
                nstr=nstr+key[i];
            }
        }
        return nstr;
    }
    public static void main(String args[]) {
    	IntegertoRoman s=new IntegertoRoman();
    	System.out.println(s.intToRoman(467));
		
		
		}
}

