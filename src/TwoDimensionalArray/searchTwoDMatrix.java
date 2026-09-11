package TwoDimensionalArray;

public class searchTwoDMatrix {
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24}
        };
        int target = 5;
        System.out.println(searchMatrix(arr, target));
    }
}
