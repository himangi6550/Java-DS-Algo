class Position {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int start=0, end=l-1,res=-1;
        if(target>nums[l-1])
            return l;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start=mid+1;
            else{
                end=mid-1;
                res=mid;
            }
        }
        return res;
    }
}
public class CeilIndex {
	public static void main(String args[]) {
		Position s=new Position();
		int nums[]={2,5,8,9,23,56};
		int p=s.searchInsert(nums,67);
		
		System.out.println(p);
		}

}
