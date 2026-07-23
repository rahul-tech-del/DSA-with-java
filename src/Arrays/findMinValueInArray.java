package Arrays;

public class findMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {13,45,55,7,78,89};
        int n = arr.length;
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
