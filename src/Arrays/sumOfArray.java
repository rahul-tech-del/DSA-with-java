package Arrays;
public class sumOfArray {
    public static void main(String[] args) {
       int[] arr = {10,20,45,56,76,36,};
        int n = arr.length;
        int  sum = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
