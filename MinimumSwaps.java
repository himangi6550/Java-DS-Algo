import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int l=arr.length;
        boolean visited[]=new boolean[l+1];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<l;i++)
        {
            map.put(i+1,arr[i]);
            visited[i+1]=false;
        }
        int swap=0;
        for(int k=1;k<=l;k++){
            if(visited[k]==false){
                visited[k]=true;
                if(map.get(k)==k){
                    continue;
                }
                else{
                    int c=map.get(k);
                    while(visited[c]!=true){
                        visited[c]=true;
                        int n=map.get(c);
                        c=n;
                        swap++;
                    }
                }
            }
        }
        return swap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

