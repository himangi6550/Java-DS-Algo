//Left array rotation without using exrra space

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */
     public static List<Integer> reverse(List<Integer> a){
         int l=a.size();
         for(int i=0;i<l/2;i++){
             int t=a.get(i);
             a.set(i,a.get(l-1-i));
             a.set(l-1-i,t);
         }
         return a;
     }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
    int l=a.size(),t,i,j=0;
    for(i=0;i<d/2;i++){
             t=a.get(i);
             a.set(i,a.get(d-1-i));
             a.set(d-1-i,t);
         }
         
         for(i=d;i<d+((l-d)/2);i++){
             t=a.get(i);
             a.set(i,a.get(l-1-j));
             a.set(l-1-j,t);j++;
         }
         a=reverse(a);
         return a;
    }

}

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> result = Result.rotLeft(a, d);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


