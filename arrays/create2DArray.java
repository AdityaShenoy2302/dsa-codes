import java.util.*;

public class create2DArray {
    public static void input(int matrix[][], int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void printMatrix(int matrix[][], int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns

        input(matrix, n, m);
        printMatrix(matrix, n, m);
        search(matrix, 4);
    }
}