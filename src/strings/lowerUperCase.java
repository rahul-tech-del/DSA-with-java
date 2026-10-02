package strings;

public class lowerUperCase {
    public static void main(String[] args) {

        // First is toLowerCase()
        String s1 = "Rahul Kumar Patel, Age is  22";
        System.out.println(s1.toLowerCase());
       // s1.toLowerCase();  ->nothing will happen
        String s2 = s1.toLowerCase();
        System.out.println(s2.toLowerCase());

        System.out.println();

        // Second toUperCase() 
        String s3 = "rahul kumar patel is software engineer";

      //  s3.toUpperCase();   -> nothing will happen

        System.out.println(s3.toUpperCase()); 

        System.out.println();


        // third is a concat()  // Added string concatenation example 
        String a = "Rahul kumar patel ";
        String b =  "is a software engineer";
        a.concat(b);
        System.out.println(a.concat(b));

        System.out.println();

        // Empty String 
        String x = "";
        System.out.println(x.length());
    }
}
