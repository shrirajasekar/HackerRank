package HackerRack;

import java.util.Scanner;

public class leftShiftArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        scanner.close();
        int[] shifted = a.clone();
        if(d==n){
        	printArray(a);
        }else{
       	for(int k=1;k<=d;k++){
        		for (int i=0;i<n;i++){
            		shifted[i] = n == (i+1) ? a[0]:a[i+1];
            	}
        		a = shifted.clone();
       	}        	
        	printArray(a);
        }

        

	}
	
	public static void printArray(int [] arr){
		String out = Integer.toString(arr[0]);
		for (int i=1;i<arr.length;i++) {
			out = out +" "+ Integer.toString(arr[i]);
		}
		System.out.println(out);
	}

}
