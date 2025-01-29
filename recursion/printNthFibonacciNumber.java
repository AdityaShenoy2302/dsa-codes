// SC: O(N)
// TC: O(2^n)

public class printNthFibonacciNumber {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(fib(4));
    }
}
