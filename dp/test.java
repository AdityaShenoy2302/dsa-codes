import java.util.*;

// abcabc
public class test {
    public static int soln(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            while (list.get(j) != s.charAt(i)) {
                list.add(s.charAt(i));
                i++;
            }
            list.remove(j);
        }

        return list.size();
    }

    public static void main(String args[]) {
        String s = "abcabc";
        System.out.println(soln(s));
    }
}
