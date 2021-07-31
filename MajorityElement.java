import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int k=len/2,c=1;
        for(int i=0;i<len;i++){
            //System.out.println(nums[i]);
            while(i<len-1 && nums[i]==nums[i+1]){
                //System.out.println(c);
                c++;
                i++;
            }
            if(c>k){
                return nums[i];
            }
            else
                c=1;
        }
        return nums[0];
    }
	
	public static void main(String args[]) {
		MajorityElement s=new MajorityElement();
		int nums[]={2,2,1,1,1,2,2};
		int n=s.majorityElement(nums);
		
		System.out.println("Majority Element: "+n);
		}

}
