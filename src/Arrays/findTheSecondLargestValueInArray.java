package Arrays;

public class findTheSecondLargestValueInArray {
    public static void main(String[] args) {
        int[] arr = {13,45,67,89,69,96};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
           largest = Math.max(largest,arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i] != largest)
                secondLargest = Math.max(secondLargest,arr[i]);
        }
        System.out.println("largest = " + largest);
        System.out.println("secondLargest = " + secondLargest);
    }
}
