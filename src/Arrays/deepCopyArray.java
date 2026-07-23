package Arrays;
import java.util.Arrays;
public class deepCopyArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //deepCopy concept
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 70;  
        System.out.println(arr[0]);         
        
        //deepCopy concept
        int[] crr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.println(arr[0]);
    }
    
}
