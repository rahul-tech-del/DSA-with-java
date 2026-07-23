package Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {23,45,35,24,56,67,};
        int n = arr.length;
        long product = 1;
        for(int i=0;i<n;i++){
            product *=arr[i];
            
        }
        System.out.println("product=" + product);
    }
    
}
