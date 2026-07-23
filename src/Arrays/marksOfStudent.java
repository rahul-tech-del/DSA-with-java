package Arrays;

import java.util.Scanner;
public class marksOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        System.out.print("Enter the array element :");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]<=15)
                System.out.print(i );
        }
    }
    
}
