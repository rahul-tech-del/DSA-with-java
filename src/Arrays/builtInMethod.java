package Arrays;
import java.util.Arrays;
public class builtInMethod {
    public static void main(String[] args) {
        int[] arr = {10,55,45,35,20,95};
        int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        Arrays.sort(arr);  // use of array of decending order
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
