package MasterPackage;

import java.util.Arrays;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hi");
		System.out.print("Hello");
		String x = "Hello";
		System.out.println(x.charAt(0));
		int [] arr = new int[] {4,8,12,45,10};
		Arrays.sort(arr);

		/*for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		int minSum = 0,maxSum=0;
        for (int i=0;i<arr.length-1;i++){
            minSum = minSum+arr[i];
        }
        for (int j=1;j<arr.length;j++){
            maxSum = maxSum+arr[j];
		}	
		System.out.println();
		
		}
}
