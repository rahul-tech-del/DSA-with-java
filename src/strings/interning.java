package strings;

public class interning {
    public static void main(String[] args) {
        String s = "Rahul";
        String q = "Rahul";
        String t = new String("Rahul");
        
        //Rahul->Rohit
        // s.charAt(0) = 'M';  error
        // s.charAt(2) = 'd'; error
        // s= "Madhav";

        System.out.println(s);
    }
}
