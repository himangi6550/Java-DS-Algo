
public class CountingBits {
	public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            if(i==0)
                res[i]=0;
            else
            res[i]=res[i/2]+ i%2;
        }
        return res;
    }
	
	public static void main(String args[]) {
		CountingBits s=new CountingBits();

		int[] p=s.countBits(6);
		for(int i=0;i<p.length;i++)
		System.out.println(p[i]);
		}

}
