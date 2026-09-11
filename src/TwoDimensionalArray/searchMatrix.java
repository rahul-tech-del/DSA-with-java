package TwoDimensionalArray;


import java.util.Scanner;
public class searchMatrix {
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int low = 0;
        int high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int i = mid / n;
            int j = mid % n;
            if (arr[i][j] == target) {
                return true;
            }
            else if (arr[i][j] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Matrix ka size
        int m = sc.nextInt();
        int n = sc.nextInt();
        // Matrix input
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Target input
        int target = sc.nextInt();
        // Search
        boolean ans = searchMatrix(arr, target);
        // Exact required output
        if (ans) {
            System.out.println("Target " + target + " is in the matrix.");
        }
        else {
            System.out.println("Target " + target + " is not in the matrix.");
        }
        sc.close();
    }
}
   