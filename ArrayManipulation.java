import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Array {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    	int row=queries.size();
    	int cols=queries.get(0).size();
    	int ar[][]=new int[row+1][n];int max=Integer.MIN_VALUE;
    	for(int i=0;i<cols;i++)
    		ar[0][i]=0;
    	for(int i=1;i<=row;i++) {
    		int a=queries.get(i-1).get(0);
    		int b=queries.get(i-1).get(1);
    		int add=queries.get(i-1).get(2);
    		for(int j=0;j<n;j++) {
    			if(j+1>=a && j+1<=b)
    				ar[i][j]=add+ar[i-1][j];
    			else
    				ar[i][j]=ar[i-1][j];
    			if(ar[i][j]>max)
    				max=ar[i][j];
    		}
    	}
    	for(int i=0;i<=row;i++) {
    		for(int j=0;j<n;j++) {
    			System.out.print(ar[i][j]+" ");
    		}
    		System.out.println();
    	}
    	return max;

    }

}

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<Integer>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        long result = Array.arrayManipulation(n, queries);

        //bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();
        System.out.println(result);
        

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

