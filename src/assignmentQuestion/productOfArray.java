package assignmentQuestion;

public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int n = arr.length;
        int product = 1;
        for(int i=0;i<n;i++){
            product *= arr[i];
        }
        System.out.println("product=" +product);
    }
    
}
