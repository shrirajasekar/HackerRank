package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int [][] hg = {{1,1,1},{0,1,0},{1,1,1}};
    	int [][] res = new int[arr.length-2][arr.length-2];
    	int max = 0;
//    	(n-2)*(n-2) iterations
    	int startRow=0;
    	int endCol=2;
    	int mul=0;
    	int a=0,b=0;
    	for(int i=0;i<((arr.length-2*(arr.length-2))-1);i++){
    		res[a][b] = arr[startRow][endCol-2]+arr[startRow][endCol-1]+arr[startRow][endCol]+arr[startRow+1][endCol-1]+arr[startRow+2][endCol-2]+arr[startRow+2][endCol-1]+arr[startRow+2][endCol];
    		a = i/(arr.length-2);
    		b = i%(arr.length-2);
    		
    		if(i%(arr.length-2)==0){
    			startRow+=1;
    		}
    		startRow%=(arr.length-2);
    		endCol+=1;
    		endCol%=(arr.length-2);
    	}
    	max = findHighest(res);
		return max;


    }

    private static int findHighest(int[][] res) {
		int m = res[res.length%res.length][res.length%res.length];
		int d = (int) Math.sqrt(res.length);
		for(int i=0;i<((res.length*res.length)-1);i++){
			if(m<res[(i/d)][(i%d)]){
			m = res[(i/d)][(i%d)];	
			}
		}
		return m;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
