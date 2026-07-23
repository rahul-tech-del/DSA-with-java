package Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr;     //shallow copy
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
