package strings;

public class containsAndStartwith {
    public static void main(String[] args) {
        // use of contains 
        String s1 = "Rahul kumarr patel";
        System.out.println(s1.contains("marr"));
        System.out.println(s1.contains("zall"));

        System.out.println();

        // use of startsWith
        String s2 = "hey, my dream a software developer";
        System.out.println(s2.startsWith("hey"));
        System.out.println(s2.startsWith("zream"));

        System.out.println();

        //use of endWith
        System.out.println(s2.endsWith("developer"));
        System.out.println(s2.endsWith("dream"));
    }
}
