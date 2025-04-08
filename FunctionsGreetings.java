import java.util.Scanner;

public class FunctionsGreetings {
    public static void main ( String[] args ) {

        greeting();

        String g = greeting1();
        System.out.println ( g );

        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter your name:" );
        String name1 = in.nextLine ();
        String greeting = greeting2 (name1);
        System.out.println ( greeting );

    }
    static void greeting ()
    {
        System.out.println ( "Hello World" );
    }
    static String greeting1 ()
    {
        String greet = "How are you? ";
        return greet;
    }
    static String greeting2(String greet2)
    {
        String message = "Hello " + greet2;
        return message;
    }

}
