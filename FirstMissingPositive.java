import java.util.Arrays;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);int l=nums.length-1;
        int k=0;
        for(int n:nums){
            while(k==0 || nums[k-1]!=n){
                nums[k]=n;
                k++;
            }
        }
        for(int j=0;j<=l;j++)
        	System.out.println(nums[j]+" ");
        int i,j=0;
        if((nums[0]>0 && nums[0]>1) || nums[l]<0)
            return 1;
        
        for(i=nums[0];i<nums[l]+1;i++){
            if(nums[j]==i){
                j++;
                continue;
            }
                else{
                    if(i>0){
                        break;
                    }
                }
            }
        
        return i;
    }
    
    public static void main(String args[]) {
    	FirstMissingPositive s=new FirstMissingPositive();
		int nums[]={1,2,3,10,2147483647,9};
		int n=s.firstMissingPositive(nums);
		
		System.out.println("First Missing Positive:" +n);
		}
}

