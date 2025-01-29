import java.util.*;

public class largestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 4;
        int b = 6;
        int c = 1;

        if ((a > b) && (a > c))
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);

        sc.close();
    }
}
