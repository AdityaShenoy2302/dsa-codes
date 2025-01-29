// O(logn)
// used for finding a^n
// modular exponentitation: a^n % p => just return ans % p

public class fastExponentiation {
    public static double binaryExpo(double a, int n) {
        double ans = 1;
        long nn = n;

        if (nn < 0) {
            a = 1 / a;
            nn = -nn;
        }

        while (nn > 0) {
            if ((nn & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            nn = nn >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(binaryExpo(2.0, 4)); // 16.0
        System.out.println(binaryExpo(2.1, 3)); // 9.261000000000001
        System.out.println(binaryExpo(2.0, -2)); // 0.25
        System.out.println(binaryExpo(0.5, -2)); // 4.0
        System.out.println(binaryExpo(2.0, 0)); // 1.0
    }
}