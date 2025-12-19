import java.util.*;

public class duplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // closing
            if (c == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening, operands, operators
                s.push(c);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))";
        String str1 = "(a-b)";
        System.out.println(isDuplicate(str)); // true
        System.out.println(isDuplicate(str1));// false
    }
}
