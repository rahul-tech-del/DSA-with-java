package strings;
import java.util.Scanner;
public class ScannerInputSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        int n = s.length() ;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(s.substring(i,j)+" ");
            }
            //System.out.println();
        }

    }
}
