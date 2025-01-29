public class towerOfHanoi {
    public static void towerOH(int n, char src, char dest, char helper) {
        if (n == 0) {
            return;
        }
        towerOH(n - 1, src, helper, dest);
        System.out.println("Move disk " + n + " from rod " + src + " to rod " + dest);
        towerOH(n - 1, helper, dest, src);
    }

    public static void main(String args[]) {
        int N = 3;
        towerOH(N, 'A', 'C', 'B');
    }
}