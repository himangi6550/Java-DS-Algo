import java.util.ArrayList;
import java.util.List;

public class MedianofTwoArrays {
    // DO NOT MODIFY BOTH THE LISTS
    public static double findMedianSortedArrays(final List<Integer> nums1, final List<Integer> nums2) {
        if(nums1.size()>nums2.size())
            return findMedianSortedArrays(nums2,nums1);
        int n1=nums1.size();
        int n2=nums2.size();
        int low=0,high=n1;double median=0.0;
        while(low<=high){
            int c1=(low+high)/2;
            int c2=(n1+n2+1)/2-c1;
            int l1=c1==0?Integer.MIN_VALUE:nums1.get(c1-1),
            l2=c2==0?Integer.MIN_VALUE:nums2.get(c2-1),
            r1=c1==n1?Integer.MAX_VALUE:nums1.get(c1),
            r2=c2==n2?Integer.MAX_VALUE:nums2.get(c2);
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0){
                    median=(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                    
                }
                else
                    median=Math.max(l1,l2);
                return median;
            }
            else if(l1>r2){
                high=c1-1;
            }
            else
                low=c1+1;
            
        }
        return median;
    }
    
    public static void main(String args[]) {
    	MedianofTwoArrays s=new MedianofTwoArrays();
    	List<Integer> nums1=new ArrayList<Integer>();
    	List<Integer> nums2=new ArrayList<Integer>();
		nums1.add(2);nums1.add(7);
		nums2.add(-2);nums2.add(8);
		
		
		System.out.println("Median of 2 arrays:"+findMedianSortedArrays(nums1,nums2));
		}

}


