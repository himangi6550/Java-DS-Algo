class searchInRotatedSortedArray {
    
    public int findMin(int[] nums){
        int N=nums.length;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            int prev=(mid+N-1)%N;
            int nxt=(mid+1)%N;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[nxt])
                return mid;
            else if(nums[mid]<=nums[end])
                end=mid-1;
            else if(nums[start]<=nums[mid])
                start=mid+1;
        }
        return -1;
    }
    
    public int binarySearch(int[] nums, int start, int end, int key){
        while(start<=end){
            int mid=start+((end-start)/2);
            
            if(nums[mid]==key)
                return mid;
            else if(nums[mid]<=key && mid+1>=start)
                start=mid+1;
            else if(key<=nums[mid] && mid-1<=end)
                end=mid-1;
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(target==nums[0])
                return 0;
            else
                return -1;
        }
        int min=findMin(nums);
 
        int left=binarySearch(nums,0,min-1,target);
        if(left==-1)
        {
            int right=binarySearch(nums,min,nums.length-1,target);
            if(right==-1)
                return -1;
            else
                return right;
    }
        else
            return left;
        
}
}
