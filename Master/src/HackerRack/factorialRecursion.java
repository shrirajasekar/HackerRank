package HackerRack;

public class factorialRecursion {
	static int res = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact = factorial(n);
		System.out.println(fact);
	}

	private static int factorial(int n) {
		int res=1;
		if(n==0){
			return 1;
		}else{		
			res = n*factorial(n-1);
			return res;
		}
		
	}
	

}

