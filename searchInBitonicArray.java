

public class searchInBitonicArray {
	
    public int findPeak(int[] A) {
        int start=0,end=A.length-1;int l=A.length;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(mid>0 && mid<l-1) {
            	if(A[mid]>A[mid+1] && A[mid]>A[mid-1])
            		return mid;
            	else if(A[mid]<A[mid+1])
            		start=mid+1;
            	else if(A[mid]<A[mid-1])
            		end=mid-1;
            }
            else if(mid==0)
            {
            	if(A[mid]>A[mid+1])
            		return 0;
            	else 
            		return 1;
            }
            else if(mid==l-1)
            {
            	if(A[mid]>A[mid+1])
            		return l-1;
            	else 
            		return l-2;
            }
            
        
    }return -1;
}
    
    public int search(int[] nums, int start, int end, int key, String str){
        while(start<=end){
            int mid=start+((end-start)/2);
            
            if(nums[mid]==key)
                return mid;
            
            else
            {
            	if(str=="asc") {
            		if(nums[mid]<key)
                        start=mid+1;
                    else if(key<nums[mid])
                        end=mid-1;
            	}
            	else
            	{
            		if(nums[mid]<key)
            			 end=mid-1;
                    else if(key<nums[mid])
                    	start=mid+1;
            	}
            }
            	
        }
        return -1;
    }
    
    public int solve(int[] A, int B) {
        int p=findPeak(A);
        int asc=search(A,0,p-1,B,"asc");
        if(asc==-1)
        {
            int desc=search(A,p,A.length-1,B,"desc");
            if(desc==-1)
                return -1;
            else
                return desc;
    }
        else
            return asc;
    }
}
