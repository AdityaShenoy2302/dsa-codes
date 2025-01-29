public class decToBin {
    public static int decBin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int remainder = n % 2;
            bin += (int) remainder * Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        int n = 15;
        int bin = decBin(n);
        System.out.println(bin);
    }
}