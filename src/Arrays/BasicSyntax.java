package Arrays;

public class BasicSyntax {
    public static void main(String[] args) {
      int[] arr;  // declaration
      arr = new int[5];  //memory allocaiton
    //initialising individual elements
      arr[0] = 10;
      arr[1] = 20;
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50; 
      // output of array elements
      System.out.println(arr[0] + "");
      System.out.println(arr[1] + "");
      System.out.println(arr[2] + "");
      System.out.println(arr[3] + "");
      System.out.println(arr[4] + "");

      arr[0] = 90;  //update the value
      System.out.println(arr[0] + " ");
      arr[0] += 100; // increase the value
      System.out.println(arr[0] + "");
    
     
   }
   
   
    
}
