package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        //int[] arr = new int[6];
        //double[] brr = {3,14,2,87,5,6};
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,10);  //arr[0]=10
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.size());  // ArrayList automatically increase it's size
       // System.out.println(arr.get(0));
        //System.out.println(arr);
      for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");  //replace arr[i]
      }
      System.out.println();
      arr.set(2,300); //modify the element at index 2
      for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");  //arr[i]
      }
      arr.add(90);   //(push back) or Add element beyond the current size (ArrayList grows dynamically)
      System.out.println();
      System.out.println(arr.size());  //use of print the array size
      for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
      }
    }
    
}
