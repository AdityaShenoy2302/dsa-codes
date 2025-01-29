// perform 1<<i to get to ith bit

public class get_ithBit {
    public static int getBit(int n, int i) {
        int bitMask = 1 << i;
        if ((bitMask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        System.out.println(getBit(10, 2));
        System.out.println(getBit(10, 3));
    }
}
