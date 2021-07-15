class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int left=0,right=left,i,s=0,r=0;
        //for(i=0;i<nums.length;i++){
            while(right<nums.length && s<=k){
               s+=nums[right];
                if(s==k)
                    break;
                right++;
                //System.out.println(s);
            }
        //System.out.println(s);
            if(s==k)
                {
                r=right+1;
                //System.out.print(s+" "+r);
                }
            else{
                while(left<=right && s>=k){
                    s=s-nums[left];
                    left++;
                }
                r=right-left+1;
            }
        // }
        return r;
    }
}
public class SubarrayWithGivenSum {
	public static void main(String args[]) {
		SubarraySum s=new SubarraySum();
		int nums[]= {1,3,11,5,14,2,1};
		int sum=s.subarraySum(nums,21);
		System.out.println("Total number of continuous elements from subarray: "+sum);
		}

}
