package Arrays;

import java.util.Scanner;

public class inputMergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            c[k] = b[j];
            j++;
            k++;
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
