package HackerRack;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * searchOneArrayForElementsOfAnotherOptimized - [using map to store input string] search the frequency of elements of query array in an input array
 */
public class searchOneArrayForElementsOfAnotherOptimized {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int inputSize = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> inputMp= new HashMap<String, Integer>();
        
        for(int i=0;i<inputSize;i++){
            String s = scanner.nextLine();
            int count = inputMp.containsKey(s) ? inputMp.get(s) : 0;
            inputMp.put(s, count + 1);
        }
        int querySize = Integer.parseInt(scanner.nextLine());
        int[] res = new int[querySize];
        for(int i=0;i<querySize;i++){
            String s = scanner.nextLine();
            res[i] = inputMp.containsKey(s)?inputMp.get(s).intValue():0;
        }
        for(int i:res){
            System.out.println(i);
        }
        scanner.close();

}
}