package HackerRack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * sequenceOfOperationOnArrayElements - trial using Map instead of zeroes array
 */
public class sequenceOfOperationOnArrayElementsOptimized {

    // Complete the arrayManipulation function below.
   
    public static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        long[] arr = new long[n];
        int  l,r;

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            l=Integer.parseInt(queriesRowItems[0]);
            r=Integer.parseInt(queriesRowItems[1]);
            arr[l-1]+=Integer.parseInt(queriesRowItems[2]);
            if(r<n)
                arr[r]-=Integer.parseInt(queriesRowItems[2]);
            
        }

        long max=0;
        long temp=0;

        for(int i=0;i<n;i++){
            temp += arr[i];
            if(temp> max) max=temp;
        }

        System.out.println(max);
        scanner.close();
    }

    
}