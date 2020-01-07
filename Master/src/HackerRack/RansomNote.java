package HackerRack;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class RansomNote {

	 static void checkMagazine(String[] magazine, String[] note) {
		 int[] count = new int[note.length];
		 int flag=1;
		 Hashtable<String, Integer> magazineTable = new Hashtable<String, Integer>();
		 Hashtable<String, Integer> noteTable = new Hashtable<String, Integer>();
		 for(int i=0;i<note.length;i++){
			 int c=0;
			 for (int j=0;j<note.length;j++){
				 if(note[i].equals(note[j])){
					 c++;
				 }
			 }
			 if(!noteTable.containsKey(note[i])){
				 noteTable.put(note[i], c);
			 }
		 }
		 
		 for(int i=0;i<magazine.length;i++){
			 int c=0;
			 for (int j=0;j<magazine.length;j++){
				 if(magazine[i].equals(magazine[j])){
					 c++;
				 }
			 }
			 if(!magazineTable.containsKey(magazine[i])){
				 magazineTable.put(magazine[i], c);
			 }
		 }
		 Set<String> keys = noteTable.keySet();
		 for(String key : keys){
			 if(magazineTable.containsKey(key) == false){
				 flag=0;
			 }else if (magazineTable.get(key)<noteTable.get(key)){
				 flag =0;
			 }
		 }
		 
		 if(flag == 0){
			 System.out.println("No");
		 }else{
			 System.out.println("Yes");
		 }

		 

	 }
		 
		 private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		       // String[] mn = scanner.nextLine().split(" ");

		        int m = 7;

		        int n = 4;

		        String[] magazine = new String[m];
		        String mag = "ive got a lovely bunch of coconuts";
		        String[] magazineItems = mag.split(" ");
		        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int i = 0; i < m; i++) {
		            String magazineItem = magazineItems[i];
		            magazine[i] = magazineItem;
		        }

		        String[] note = new String[n];
		        String not	= "ive got some coconuts";
		        String[] noteItems = not.split(" ");

		        for (int i = 0; i < n; i++) {
		            String noteItem = noteItems[i];
		            note[i] = noteItem;
		        }

		        checkMagazine(magazine, note);

		        //scanner.close();
		    }


}
