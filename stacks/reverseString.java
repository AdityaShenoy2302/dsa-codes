import java.util.*;

public class reverseString {
    public static String reverseUsingStack(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        System.out.println(reverseUsingStack("aabccd"));
    }
}
