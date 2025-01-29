// Goldman Sachs
// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up

public class friendsPairingProblem {
    public static int friendsParing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return friendsParing(n - 1) + (n - 1) * friendsParing(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(friendsParing(3));
    }
}
