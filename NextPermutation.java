class Permutation {
    public void swap(int[] nums,int i,int j)
        {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
    
    public void nextPermutation(int[] nums) {
        int l=nums.length;int ind1=-1,ind2=-1;
        
        for(int i=l-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }if(ind1>-1)
        {for(int i=l-1;i>=0;i--){
            if(nums[i]>nums[ind1]){
                ind2=i;
                break;
            }}
        }int j=l-1;
        if(ind1>-1 && ind2>-1)
        {
            swap(nums,ind1,ind2);       
        
        
        for(int i=ind1+1;i<(l+ind1+1)/2;i++){
            swap(nums,i,j);
            j--;
        }
        }
        else{
          for(int i=0;i<(l)/2;i++){
            swap(nums,i,j);
            j--;
        }  
        }
    }
}
public class NextPermutation {
	public static void main(String args[]) {
		Permutation s=new Permutation();
		int nums[]={1,2,3,2,1};
		s.nextPermutation(nums);
		for(int i=0;i<nums.length;i++)
		System.out.println(nums[i]);
		}

}
