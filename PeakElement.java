class Peak {
    public int solve(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int start=0,end=nums.length-1,ind=-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(mid>0 && mid<end){
                if(nums[mid]>=nums[mid+1] && nums[mid]>=nums[mid-1])
                    return nums[mid];
                else if(nums[mid]<nums[mid+1])
                    start=mid+1;
                else if(nums[mid]<nums[mid-1])
                    end=mid-1;
        }
            else if(mid==0){
                if(nums[0]>nums[1])
                    return nums[0];
                else
                    return nums[1];
            }
            else{
                if(nums[end]>nums[end-1])
                    return nums[end];
                else
                    return nums[end-1];
            }
        }
        
        return ind;
    }
}

public class PeakElement {
	public static void main(String args[]) {
		Peak s=new Peak();
		int nums[]={1,2,3,7,3,54,2,1};
		int val=s.solve(nums);
		System.out.println(val);
		}

}
