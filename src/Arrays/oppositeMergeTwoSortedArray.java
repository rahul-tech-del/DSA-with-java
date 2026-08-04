package Arrays;

public class oppositeMergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 62};
        int[] b = {26,54,69,81,94};
        int[] c = new int[a.length + b.length];
        int i = a.length - 1;
        int j = b.length-1;
        int k = c.length-1;
        // merging
        while(i>=0 && j>=0){
            if(a[i] >= b[j]){
                c[k] = a[i];
                i--;
            }
            else{
                c[k] = b[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            c[k] = b[i];
            i--;
            k--;
        }
        while(j>=0){
            c[k] = a[j];
            j--;
            k--;
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
