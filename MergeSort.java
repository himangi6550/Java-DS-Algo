
public class MergeSort {
	
	static void merge(int[] arr,int l,int mid,int r){
		int i=l,j=mid+1,k=l;
		int b[]=new int[r+1];
		while(i<=mid && j<=r) {
			if(arr[i]<arr[j]) {
				b[k]=arr[i];
				k++;i++;
			}
			else {
				b[k]=arr[j];
				k++;j++;
			}
		}
		while(i<=mid) {
			b[k]=arr[i];
			k++;i++;
		}
		while(j<=r) {
			b[k]=arr[j];
			k++;j++;
		}
		for(int m=l;m<=r;m++)
			arr[m]=b[m];
	}
	
	static void mergesort(int[] arr,int l,int r){
		if(l<r) {
		int mid=l+(r-l)/2;
		mergesort(arr,l,mid);
		mergesort(arr,mid+1,r);
		merge(arr,l,mid,r);
		}
		
	}
	
	public static void main(String args[]) {
		int arr[]= {2,5,4,9,3,53,0,6,66};
		int l=0;
		int r=arr.length-1;
		mergesort(arr,l,r);
		for(int i=0;i<=r;i++)
			System.out.print(arr[i]+" ");
	}

}
