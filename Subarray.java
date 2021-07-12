class MaxLength {
    public int findLength(int[] nums1, int[] nums2) {
        
        int n=nums1.length,m=nums2.length,max=0;
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                    if(max<dp[i][j])
                        max=dp[i][j];
                }
                else
                    dp[i][j]=0;
            }
        }
        
        return max;
    }
}
    
public class Subarray {
	public static void main(String args[]) {
	MaxLength s=new MaxLength();
	int nums1[]={1,2,3,2,1};
	int nums2[]={3,2,1,4,7};
	int len=s.findLength(nums1,nums2);
	System.out.println(len);
	}

}
