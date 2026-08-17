package TwoDimensionalArray;

public class maxInArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,10},{4,5,20},{-10,-20,30}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
