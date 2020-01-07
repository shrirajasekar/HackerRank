import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int numIntegers = sc.nextInt();
        int rotateNum = sc.nextInt();
        int num;
        int index;
        
        int[] a = new int[numIntegers];
        int[] b = new int[numIntegers];
        
        for (int i = 0; i < numIntegers; i++)
            {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numIntegers; i++)
            {
            index = i - rotateNum;
            if (index < 0)
                {
                index = numIntegers + index;
            }
            b[index] = a[i];
        }
        
        for (int i = 0; i < numIntegers; i++)
            {
            System.out.print(b[i] + " ");
        }
        
    }
}