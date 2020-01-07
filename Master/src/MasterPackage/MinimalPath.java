package MasterPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MinimalPath {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    int size = Integer.parseInt(in.readLine());
    String[] row = null;
    int [][] matrix = new int [size][size];
    int i=0,j=0;
    while ((line = in.readLine()) != null) {
      System.out.println(line);
      row  = line.split(" ");
      for (String x : row){
    	  matrix[i][j] =Integer.parseInt(x);
    	  j++;
      }
    	i++;  
    }
    
    for (int k = size - 2; k >= 0; k--) {
        matrix[size - 1][k] =  matrix[size - 1][k] + matrix[size - 1][k+1];
        matrix[k][size - 1] = matrix[k][size - 1] + matrix[k+1][size - 1];
    }
     
    for (int x = size - 2; x >= 0; x--) {
        for (int y = size - 2; y >= 0; y--) {
        	matrix[x][y] += Math.min(matrix[x + 1][ y], matrix[x][ y + 1]);
        }
    }
    System.out.println(matrix[0][0]);
    
  }
}