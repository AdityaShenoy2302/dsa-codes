public class numPalindrome {
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = lastDigit + (reverse * 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }

    public static void main(String args[]) {
        int n = 121;
        if (isPalindrome(n)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }
}
