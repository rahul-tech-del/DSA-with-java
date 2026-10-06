package strings;

public class modifyCharacterInString {
    public static void main(String[] args) {
        String s = "hello";
        // hello -> heylo
        // 2nd index change tc y
        s = s.substring(0,2) +  'y' + s.substring(3);
        System.out.println(s);
    }
    
}
