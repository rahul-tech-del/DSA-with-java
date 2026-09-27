package AssignmentQueastion2DArray;

public class addTwoMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix1.length, n = matrix1[0].length;
        int[][] matrix2 = {{4,5,8},{0,0,8},{1,2,0}};
        int a = matrix2.length, b = matrix2[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
