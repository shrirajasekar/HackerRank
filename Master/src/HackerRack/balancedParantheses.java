package HackerRack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

/**
 * balancedParantheses
 */
public class balancedParantheses {

    public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
        Stack<Character> stack = new Stack<>();
        boolean flagBalanced = true;
    
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')') {
                    c = '(';
                } else if (c == '}') {
                    c = '{';
                } else if (c == ']') {
                    c = '[';
                }
                if (stack.empty()) {
                    flagBalanced = false;
                    break;
                }
                if (c == stack.peek()) {
                    stack.pop();
                } else {
                    flagBalanced = false;
                    break;
                }
            }
        }
        if (flagBalanced) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
      
    }
    
}
}