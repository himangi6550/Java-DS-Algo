import java.util.Arrays;

class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        int i,l=nums.length;
        for(i=0;i<l;i++){
            if(nums[i]<=0)
                nums[i]=l+1;
        }
        for(i=0;i<l;i++){
            int n=Math.abs(nums[i]);
            if(n<=l && nums[n-1]>0)
                nums[n-1]=-nums[n-1];
        }
        for(i=0;i<l;i++){
            if(nums[i]>0)
                return i+1;
        }
        return l+1;
    }
    
    public static void main(String args[]) {
    	FirstMissingPositive s=new FirstMissingPositive();
		int nums[]={1,2,3,10,2147483647,9};
		int n=s.firstMissingPositive(nums);
		
		System.out.println("First Missing Positive:" +n);
		}
}

