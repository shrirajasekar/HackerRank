package HackerRack;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * searchOneArrayForElementsOfAnother - search the frequency of elements of query array in an input array
 */
public class searchOneArrayForElementsOfAnother {


    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int count =0;
        int iter = 0;
        int [] res = new int[queries.length];
        for(String i:queries){
            for(String j : strings){
                if(i.equals(j)){
                    count++;
                }
            }
            res[iter]=count;
            iter++;
        }
        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            // bufferedWriter.write(String.valueOf(res[i]));

            // if (i != res.length - 1) {
            //     bufferedWriter.write("\n");
            // }
            System.out.println(res[i]);
        }

        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
}
}