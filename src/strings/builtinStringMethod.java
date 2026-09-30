package strings;

public class builtinStringMethod {
    public static void main(String[] args) {
        String s = " hey, i am rahul kumarr ";
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(6));
        System.out.println(s.charAt(8));
        System.out.println(s.charAt(10));
        System.out.println(s.charAt(15));
        //System.out.println(s.charAt(30));   // this is out of string so this generate error

        int n = s.length();
        System.out.print("Length of the string :"+ n);
    }
}
