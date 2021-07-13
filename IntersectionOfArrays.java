import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);Arrays.sort(nums2);
        int k=0,j=0;
        List<Integer> res=new ArrayList<Integer>();
        while(k<nums1.length && j<nums2.length){
            if(nums1[k]==nums2[j]){
                if(!res.contains(nums1[k])){
                res.add(nums1[k]);}
                k++;j++;
            }
        else if(nums1[k]<nums2[j])
            k++;
        else
            j++;
    }
        int[] arr = res.stream().mapToInt(i -> i).toArray();
        return arr;
      
}
}
public class IntersectionOfArrays {
	public static void main(String args[]) {
		Intersection s=new Intersection();
		int nums1[]={1,2,3,2,1};
		int nums2[]={3,2,1,4,7};
		int inter[]=s.intersection(nums1,nums2);
		for(int i=0;i<inter.length;i++)
		System.out.println(inter[i]);
		}

}
