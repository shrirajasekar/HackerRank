import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchantProblem {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
		int res = 0;
		int fres = 0;
		int prev = 0;
		int cur = 0;
		Arrays.sort(ar);
		prev = ar[0];
		for(int i=1;i <n; i++){
			cur = ar[i];
			if(prev==cur){
				res+=1;
			}if(prev != cur || i==n-1){
				res = (res+1)/2;
				fres+=res;
				res = 0;
			}
				
			prev = cur;
		}
		
		return fres;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("Result :"+Integer.toString((result)));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
