package Arrays;

public class findMaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {10,-3,-4,66,78};
        int n = arr.length;
        int max =arr[0] ;
        // int max = Integer.MIN_VALUE; //same up and down
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                // max = Math.max(max,arr[i]);  same method
            }
        }
         System.out.println(max);
    }
}
