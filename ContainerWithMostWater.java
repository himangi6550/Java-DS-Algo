public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=Integer.MIN_VALUE;
        while(i<=j){
            int h=Math.min(height[i],height[j]);
            int area=(j-i)*h;
            if(area>max)
                max=area;
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return max;
    }


	public static void main(String args[]) {
		ContainerWithMostWater s=new ContainerWithMostWater();
		int nums[]={1,2,3,2,1};
		int area=s.maxArea(nums);
		
		System.out.println("Maximum area: "+area);
		}

}
