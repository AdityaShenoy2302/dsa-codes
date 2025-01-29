// set => make the bit 1

public class set_ithBit {
    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String args[]) {
        System.out.println(setBit(10, 2));
    }
}
