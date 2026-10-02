package strings;

public class InputString {
    public static void main(String[] args) {
        String s = "abcde";
        // System.out.println(s.substring(1));
        // System.out.println(s.substring(1,4));
        // System.out.println(s.substring(2,2));
        // System.out.println(s.substring(0,5));

        // print all substrings
        for(int i=1;i<s.length();i++){
            for (int j = i+1; j <=5; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
