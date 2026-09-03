package TwoDimensionalArray;

import java.util.Scanner;

public class inputMatrixMultiplication {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();   
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                b[i][j] = sc.nextInt();
            }
        }

        if(a[0].length != b.length){
            return;
        }
        int[][] c = new int[m][p];
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                for(int k=0; k<b.length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        } 
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }     
    }
}
