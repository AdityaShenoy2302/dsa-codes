public class binToDec {
    public static void binDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + dec);
    }

    public static void main(String[] args) {
        binDec(111);
    }
}
