package TwoDimensionalArray;

public class minInArray {
    public static void main(String[] args) {
        int[][] arr = {{-1,-2,10},{-3,-4,20},{-4,-5,30}};
        int min = Integer.MAX_VALUE;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, arr[i][j]);
            }
        }
        System.out.println(min);
    }
}
