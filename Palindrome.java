import java.util.Scanner;

public class Palindrome
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );

        System.out.println ( "Enter a number:" );
        int n = in.nextInt ( );

        int flag = 0;
        double p =  Math.sqrt ( n );

        for ( int i = 2 ; i <= p ; i++ )
        {
            if ( n % i == 0 )
            {
                flag++;
            }
        }
        if ( flag == 0 )
            System.out.println ( "Prime" );
        else
            System.out.println ( "Not Prime" );
    }
}
