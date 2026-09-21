package TwoDimensionalArray;

import java.util.Scanner;

public class waveprinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Wave Printing
        for (int j = 0; j < n; j++) {

            if (j % 2 == 0) {
                // Top to Bottom
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Bottom to Top
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
