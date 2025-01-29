// O(logn)

public class power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = pow(x, n / 2);
        int halfPowerSq = halfpower * halfpower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]) {
        System.out.println(pow(2, 5));
    }
}
