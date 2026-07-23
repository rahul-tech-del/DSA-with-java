package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class findFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        System.out.println("Enter the array element :");
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        int index = -1;
        for(int i=0;i<arr.size();i++){
          if(arr.get(i)==target)
            index = i;
        }
        System.out.println("Index :"+index);
        sc.close(); 
    }
}
