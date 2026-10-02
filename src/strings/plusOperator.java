package strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "ABCD";
        String t = "PQRS";
        //s += t;
        //s = t + 10;
        s = s + t;
        System.out.println(s);
        System.out.println("hey I AM A ENGINEER"+10);
        System.out.println("ABCD"+10+20);
        System.out.println(10+20+"ABCD");
        System.out.println(10+"ABCD"+20);
    }
}
