import java.util.Scanner;

public class sumofdigits
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number: " );
        int n = in.nextInt ();
        int sum = 0;
        for ( n=n;n>0;n/=10 )
        {
            int dig = n%10;
            sum = sum + dig;
        }
        System.out.println ( sum );
    }
}
