package MasterPackage;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Master {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int lSum=0,rSum=0;
        System.out.println("Array len = "+arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    lSum = lSum+arr[i][j];
                    System.out.println("lelem = "+arr[i][j]);
                    System.out.println("lSum = "+lSum);
                } if((i+j)==arr.length-1){
                    rSum = rSum+arr[i][j];
                    System.out.println("relem = "+arr[i][j]);
                    System.out.println("rSum = "+rSum);
                }
            }
        }
        int res = lSum-rSum;
        if(res < 0){
            res = res * (-1);
        }

        return res;

    }


    public static void main(String[] args) throws IOException {
        int[][] arr = new int [][]{
        	{11,2,4},
        	{4,5,6},
        	{10,8,-12}
        };
        int result = diagonalDifference(arr);
        System.out.println(result);
            }
}

