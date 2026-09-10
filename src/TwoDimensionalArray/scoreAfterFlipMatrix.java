package TwoDimensionalArray;

public class scoreAfterFlipMatrix {
    public int matrixScore(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        // put a 1 at the first position of every row
        for(int i = 0; i < m; i++) {
            if(arr[i][0] == 0) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
        // flip those columns where (no of 0s > no of 1s)
        for(int j = 1; j < n; j++) {
            int noOfZeroes = 0;
            int noOfOnes = 0;
            for(int i = 0; i < m; i++) {
                if(arr[i][j] == 0)
                    noOfZeroes++;
                else
                    noOfOnes++;
            }
            if(noOfZeroes > noOfOnes) {
                for(int i = 0; i < m; i++) {
                    if(arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
        int score = 0;
        int x = 1;
        for(int j = n - 1; j >= 0; j--) {
            for(int i = 0; i < m; i++) {
                score += arr[i][j] * x;
            }
            x *= 2;
        }
        // Final matrix print
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return score;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 0}
        };
        scoreAfterFlipMatrix obj = new scoreAfterFlipMatrix();
        int result = obj.matrixScore(arr);
        System.out.println("Score = " + result);
    }
}
