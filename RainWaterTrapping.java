
public class RainWaterTrapping {
	public int trap(int[] height) {
        int len=height.length;
        if(len==0 || len==1 ||len==2)
            return 0;
        
        int mxl[] =new int[len];
        int mxr[]=new int[len];
        mxr[0]=height[0];
        mxl[len-1]=height[len-1];
        int s=0;
        for(int i=1;i<len;i++){
            mxr[i]=Math.max(mxr[i-1],height[i]);
        }
        for(int i=len-2;i>=0;i--){
            mxl[i]=Math.max(mxl[i+1],height[i]);
        
        }
        for(int i=0;i<len;i++){
            s+=(Math.min(mxl[i],mxr[i]) - height[i]);
        }
        
        return s;
    }
	
	public static void main(String args[]) {
		RainWaterTrapping s=new RainWaterTrapping();
		int nums[]={5,1,2,3,2,1,8};
		int total=s.trap(nums);
		
		System.out.println("Total water trapped: "+total);
		}

}
