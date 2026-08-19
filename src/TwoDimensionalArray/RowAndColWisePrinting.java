package TwoDimensionalArray;

public class RowAndColWisePrinting {
    public static void main(String[] args) {


        //  1 , 2
        //   3 , 4
        //   5 , 6
        // Col-Wise print or transpose matrix

        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;

        for (int j = 0; j < n; j++) {   // Col
            for (int i = 0; i < m; i++) {    // Row
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // Storing
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
