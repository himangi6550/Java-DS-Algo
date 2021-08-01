
public class Numberof1Bits {
	public int hammingWeight(int n) {
        // if(n==0) return 0;
        // if(n==1) return 1;
        //  return hammingWeight(n&(n-1))+1;
        int c=0;
        while(n!=0){
            n=n&(n-1);
            c++;
        }
        return c;
        
	}
        public static void main(String args[]) {
        	Numberof1Bits s=new Numberof1Bits();

    		int p=s.hammingWeight(00001010111000);
    		
    		System.out.println(p);
    		}

}
