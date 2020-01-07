package MasterPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Test {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
	  	int coins[] = {1, 3, 9}; 
		int n = coins.length; 
		int input = 0; 		
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    while ((line = in.readLine()) != null) {
	      input = Integer.parseInt(line);	      
	      System.out.println(minOfCoins(coins, n, input) ); 
	    }
	    
	  }
  public static int minOfCoins(int coins[], int n, int input) 
  { 
     // base case 
     if (input == 0) return 0; 
     
     // Initialize result 
     int res = Integer.MAX_VALUE; 
     
     // Try every coin that has smaller value than V 
     for (int i=0; i<n; i++) 
     { 
       if (coins[i] <= input) 
       { 
           int interRes = minOfCoins(coins, n, input-coins[i]); 
     
           // Check for INT_MAX to avoid overflow and see if 
           // result can minimized 
           if (interRes != Integer.MAX_VALUE && interRes + 1 < res) 
              res = interRes + 1; 
       } 
     } 
     return res; 
  } 
}
