package HackerRack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * sequenceOfOperationOnArrayElements
 */
public class sequenceOfOperationOnArrayElements {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n,int m, Long[][] queries) {
        long[] zeroes = new long[n];
        long max = 0;
    
        for(int i=0;i<m;i++){
            for(long j = (queries[i][0] - 1); j < queries[i][1]; j++) {
                zeroes[(int) j] += queries[i][2];
                for(long x : zeroes) {
                    System.out.print(Long.toString(x)+" ");
                }
                System.out.println();
            }
        }
        max = findMaxElem(zeroes);

        return max;

    }

    public static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        Long[][] queries = new Long[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                Long queriesItem = Long.parseLong(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, m, queries);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();
        System.out.println(result);
        scanner.close();
    }

    private static long findMaxElem(long[] zeroes) {
        long max = zeroes[0];
        for (int i = 0; i < zeroes.length; i++) {
            if (zeroes[i] > max) {
                max = zeroes[i];
            }
        }
        return max;
    }
}