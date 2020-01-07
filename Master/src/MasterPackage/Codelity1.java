package MasterPackage;

import java.util.Scanner;

public class Codelity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number : ");
		int A = input.nextInt();
		//int [] ADigits =  Integer.toString(A).chars().map(c -> c-'0').toArray();
		String ADigits = Integer.toString(A);
		int len = numOfDigits(A);
		//int res[] = new int[ADigits.length];
		String r = "";
		 
		 for(int i=0;i<len;i++){
			 r = r+ ADigits.charAt(i);
			 r = r+ ADigits.charAt(len-1-i);			 
		 }
		 
		 r = r.substring(0,len);
		 int x = Integer.parseInt(r);
		 System.out.println(r);
	}

	public static int numOfDigits(int num){
		int x=0;
		  while(num!=0){			  
			  num= num/10;
			  x++;
		  }
		  return x;
	}
	
	/*public static int numToArray(int num){
		int [] temp = new int[numOfDigits(num)];
		int x=0;
		  while(num!=0){	
			  temp[x]=num%
			  num= num/10;
			  x++;
		  }
		  return x;
	}*/
	
}
