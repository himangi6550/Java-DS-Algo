

	import java.io.*;

	class KandanesAlgorithm {
	    
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
			while(t-->0){
			    //size of array
			    int n = Integer.parseInt(br.readLine().trim());
			    int arr[] = new int[n];
			    String inputLine[] = br.readLine().trim().split(" ");
			    
			    //adding elements
			    for(int i=0; i<n; i++){
			        arr[i] = Integer.parseInt(inputLine[i]);
			    }
			    
			    Solution obj = new Solution();
			    
			    //calling maxSubarraySum() function
			    System.out.println(obj.maxSubarraySum(arr, n));
			}
		}
	}

	// } Driver Code Ends


	class Solution{

	    // arr: input array
	    // n: size of array
	    //Function to find the sum of contiguous subarray with maximum sum.
	    int maxSubarraySum(int arr[], int n){
	        
	        // Your code here
	        int max_so_far = arr[0], max_ending_here = 0;
	 
	    for (int i = 0; i < n; i++)
	    {
	        max_ending_here = max_ending_here + arr[i];
	        if (max_ending_here < 0)
	            max_ending_here = 0;
	         
	        
	        else if (max_so_far < max_ending_here)
	            max_so_far = max_ending_here;
	         
	    }
	    return max_so_far;
	        
	    }
	    
	}



