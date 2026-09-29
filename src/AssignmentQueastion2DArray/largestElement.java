package AssignmentQueastion2DArray;

public class largestElement {
     public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 8},
            {45, 12, 30},
            {7, 60, 20}
        };

        int largest = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }

            }
        }

        System.out.println("Largest element = " + largest);
    }
}
