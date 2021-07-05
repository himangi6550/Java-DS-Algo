import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// Pseudo Code for Largest Rectangle in Histogram
class Histogram {
	public List<Integer> right(int[] heights){
        List<Integer> list=new ArrayList<Integer>();
        Stack <Integer> stack=new Stack<Integer>();
        int n=heights.length;
        for(int i=n-1;i>=0;i--){
            if(stack.size()==0)
                list.add(n);
            else {
            	if(heights[stack.peek()] < heights[i])
            		list.add(stack.peek());
            	else {
            		while(heights[stack.peek()] >= heights[i] && stack.size()>0)
            			stack.pop();
            		if(stack.size()==0)
            			list.add(n);
            		else
            			list.add(stack.peek());
            		
            	}
            }
            stack.push(i);  
        }
        for(int i=0;i<list.size()/2;i++) {
        	int t=list.get(i);
        	list.set(i, list.get(list.size()-i-1));
        	list.set(list.size()-i-1, t);
        }
        return list;
       
    }
	
	public List<Integer> left(int[] heights){
        List<Integer> list=new ArrayList<Integer>();
        Stack <Integer> stack=new Stack<Integer>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            if(stack.size()==0)
                list.add(-1);
            else {
            	if(heights[stack.peek()] < heights[i])
            		list.add(stack.peek());
            	else {
            		while(heights[stack.peek()] >= heights[i] && stack.size()>0)
            			stack.pop();
            		if(stack.size()==0)
            			list.add(-1);
            		else
            			list.add(stack.peek());
            		
            	}
            }
            stack.push(i);  
        }
        return list;
       
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        List<Integer> nsr=new ArrayList<Integer>();
        List<Integer> nsl=new ArrayList<Integer>();
        nsr=right(heights);
        nsl=left(heights);
        int max=0;
        int width[]=new int[n];
        int area[]=new int[n];
        for(int i=0;i<n;i++){
            width[i]=nsr.get(i)-nsl.get(i)-1;
            area[i]=heights[i]*width[i];
            if(area[i]>max)
                max=area[i];
        }
        return max;
    }
}