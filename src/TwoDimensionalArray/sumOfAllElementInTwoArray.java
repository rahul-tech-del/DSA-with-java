package TwoDimensionalArray;

public class sumOfAllElementInTwoArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{-5,-6,-7},{40,50,60}};
        int sum = 0;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all element :" +sum);
    }
}
