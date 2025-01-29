public class binCoeff {

    public static int factorial(int n) {
        int fact = 1;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static int binCoefficient(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int result = a / (b * c);
        return result;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int c = 1;
        int fact = factorial(a);
        int binomialcoeff = binCoefficient(b, c);
        System.out.println(fact);
        System.out.println(binomialcoeff);
    }
}
