package Arrays;

import java.util.Scanner;

public class sumOfInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element :");
        int x = arr.length;
        int sum = arr[0];

        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }
        System.out.println("Sum of array element = "+ sum);
    }
    
}
