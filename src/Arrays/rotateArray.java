package Arrays;
import java.util.Arrays;
public class rotateArray {
    public void reverse(int[] arr, int i,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        rotateArray obj = new rotateArray();
        int[] arr = {10,20,30,40,50,60,70,80};
        int k = 3;
        obj.rotate(arr , k);
        System.out.println(Arrays.toString(arr));
    }
}
