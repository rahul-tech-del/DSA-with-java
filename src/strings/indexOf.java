package strings;

public class indexOf {
    public static void main(String[] args) {

        // This is use of indexOf()
        String s = "Rahul kumar";
        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('u'));
        System.out.println(s.indexOf('f'));
        System.out.println(s.indexOf('z'));

        // this is use of compareTo
        String a = "abc";
        String b = "abcggg";
        System.out.println(a.compareTo(b));
    }
}
