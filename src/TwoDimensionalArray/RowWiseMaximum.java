package TwoDimensionalArray;

import java.util.Scanner;

public class RowWiseMaximum {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Rows and columns input
        int m = sc.nextInt();
        int n = sc.nextInt();

        // 2D Array
        int[][] arr = new int[m][n];

        // Array input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Find maximum element of each row
        for (int i = 0; i < m; i++) {

            int max = arr[i][0];

            for (int j = 1; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            System.out.println("Row " + (i + 1) + " maximum = " + max);
        }
    }
}
