package HackerRack;

import java.util.Arrays;
import java.util.Scanner;

public class leftShiftArrayNoLoop {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        if(d==n){
        	System.out.println(aItems);
        }else{
			String shifted = Arrays.toString(Arrays.copyOfRange(aItems, d, n))+ Arrays.toString(Arrays.copyOfRange(aItems, 0, d));
			System.out.println(shifted.replace(",", "")
			.replace("]["," ")
			.replace("["," ")
			.replace("]"," ")
			.trim());
        }
	}
}
