
public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,-2,2,55,3,4};
		int m=Integer.MAX_VALUE;int sm=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<m) {
				
				m=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<sm && arr[i]!=m) {
				
				sm=arr[i];
			}
		}
		
		System.out.print(m+" "+sm);

	}

}
