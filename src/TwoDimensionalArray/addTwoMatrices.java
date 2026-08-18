package TwoDimensionalArray;

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{2,4,5},{7,6,5},{6,8,9}};
        int[][] b = {{6,8,9},{2,4,5},{7,6,5}};
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
