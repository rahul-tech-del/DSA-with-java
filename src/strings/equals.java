package strings;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
    
        
        System.out.println(s==a);
        System.out.println();
        //  == is used for reference comparison
        System.out.println(s==b);
        System.out.println();
        //equals() is used to compare strings character by character
        System.out.println(s.equals(b));
        System.out.println();

        //this is same as equal()
        System.out.println(s.compareTo(b));
    }
}
