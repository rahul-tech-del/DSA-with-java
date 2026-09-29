package AssignmentQueastion2DArray;

public class sumOfRectangle {
    public static void main(String[] args) {
        int[][] matrix =  {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int m = matrix.length, n = matrix[0].length;
        int l1 = 1, r1 = 2;
        int l2 = 3, r2 = 3;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum = sum + matrix[i][j]; 
            }
        }
         System.out.println(sum+" ");
    }
}
