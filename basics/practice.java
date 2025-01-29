public class practice {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int lines = 1; lines <= n; lines++) {
            for (int number = 1; number <= lines; number++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
