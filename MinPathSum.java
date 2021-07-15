class PathSum {
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        if(rows==0)
            return 0;
        int cols=grid[0].length;
        int[][] dp=new int[rows][cols];
        int i,j;
        //dp[0][0]=grid[0][0];
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(i==0 && j==0)
                    dp[i][j]=grid[i][j];
                else if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if (j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else{
                    dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[rows-1][cols-1];
    }
}
public class MinPathSum {
	public static void main(String args[]) {
		PathSum s=new PathSum();
		int nums[][]= {{1,3,1},{1,5,1},{4,2,1}};
		int sum=s.minPathSum(nums);
		System.out.println(sum);
		}

}
