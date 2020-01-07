package MasterPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Test2 {
	  /**
	   * Iterate through each line of input.
	   */
	  public static void main(String[] args) throws IOException {
		int x = 0,r=0,s=0,d=0,iter=0;
		int stop = 0;
		int firstDigit=0,lastDigit=0;
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    while ((line = in.readLine()) != null) {
	    	x =  Integer.parseInt(line);	    	
	    	while(stop!=1){
	    					r = reversal(x);
					    	s = x+r;
					    	d = numOfDigits(s);
					    	firstDigit = (int) (s/Math.pow(10, d-1));
					    	lastDigit = (int) s%10;
					    	iter++;
					    	if(firstDigit == lastDigit){
					    		stop=1;					    		
					    	}
					    	x = s;
		    	}
	      System.out.println(iter+ " "+ x);
	    }
	  }
	  
	  public static int reversal(int num){
		  int reversenum = 0;
		  while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }
		  return reversenum;
	  }
	  
	  public static int numOfDigits(int num){
		  int x=0;
		  while(num!=0){
			  num= num/10;
			  x++;
		  }
		  return x;
	  }
}
