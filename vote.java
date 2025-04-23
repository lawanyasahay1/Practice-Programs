import java.util.Scanner;

public class vote
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the age: " );
        int n = in.nextInt ();
        System.out.println ("Is the candidate eligible? " + eligible(n));

    }
    static String eligible(int n)
    {
        if( n>=18)
            return "YES";
        else
            return "NO";
    }
}
