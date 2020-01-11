package HackerRack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * ran
 */
public class ran {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            
			line = line.trim();
			String[] ip = line.split(" ");
			long res = 0;
			if (ip[1].contains("+")) {
				String[] splitted = ip[1].split("\\+");
				res = Long.parseLong(ip[0].substring(0, splitted[0].length()))
						+ Long.parseLong(ip[0].substring(splitted[0].length()));
			} else if (ip[1].contains("-")) {
				String[] splitted = ip[1].split("-");
				res = Long.parseLong(ip[0].substring(0, splitted[0].length()))
						- Long.parseLong(ip[0].substring(splitted[0].length()));
			}
			System.out.println(res);
        }
      }
        
    }