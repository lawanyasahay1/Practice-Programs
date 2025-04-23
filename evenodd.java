import java.util.Scanner;

public class evenodd
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ("Enter a number: " );
        int n = in.nextInt ( );
        System.out.println ( "The given number is: " + evenodds(n) );
    }

    static String evenodds(int n)
    {
        if(n==1 || n==0)
        return "Invalid Input";
        else if(n%2==0)
            return "Even";
        else
            return "Odd";
    }
}
