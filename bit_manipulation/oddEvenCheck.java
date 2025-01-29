// odd numbers: LSB = 1
// even numbers: LSB = 0
// perform & with 1 to get LSB

public class oddEvenCheck {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }

    public static void main(String args[]) {
        oddEven(2);
        oddEven(11);
        oddEven(22);
    }
}