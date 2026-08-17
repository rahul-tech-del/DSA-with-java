package TwoDimensionalArray;

import java.util.Scanner;

public class storeMarksAndRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row (m) :");
        int m = sc.nextInt();
        System.out.println("Enter the number of coloum (n3) ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              arr[i][j] = sc.nextInt();    
            }           
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");            
            }
            System.out.println();
        }
    }
}
