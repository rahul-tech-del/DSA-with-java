package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int[][] arr = new int[3][3];
        int n = arr.length;

        // Input of 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }

        //Output of 2D array
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
