
public class spiralPrint {
	public static int[][] prettyPrint(int A) {
		
		int t=0,b=(A*2)-2,l=0,r=(A*2)-2,dir=0;
		int[][] arr=new int[(A*2)-1][(A*2)-1];
		while(l<=r && t<=b) {
			if(dir==0) {
				for(int k=l;k<r;k++)
					arr[t][k]=A;
				t++;
				dir=1;
			}
			else if(dir==1) {
				for(int k=t;k<b;k++)
					arr[k][r]=A;
				r--;
				dir=2;
			}
			else if(dir==2) {
				for(int k=r;k>l;k--)
					arr[b][k]=A;
				b--;
				dir=3;
			}
			else if(dir==3) {
				for(int k=b;k>t;k--)
					arr[k][l]=A;
				l++;
				dir=0;
				A--;
			}
			}
		return arr;
		}
	public static void main(String args[]) {
		int[][] arr=prettyPrint(4);
		for(int i=0;i<(4*2-1);i++) {
			for(int j=0;j<i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
    }

