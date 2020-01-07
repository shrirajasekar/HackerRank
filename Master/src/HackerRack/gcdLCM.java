package HackerRack;

import java.util.Scanner;

public class gcdLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a= sc.nextInt();
		b=sc.nextInt();
		
		int min;
		
		if(a<b){
			min = a;
		}else{
			min=b;
		}
		int i;
		for(i=min;i>=1;i--){
			if(a%i==0&&b%i==0){
				System.out.println("GCD "+i);
				break;
			}
		}
		
		System.out.println("LCM "+ a*b/i);		//Prod   of two num = gcd  * lcm : i is the gcd here
	}

}
