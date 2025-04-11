import java.util.Scanner;

public class PrimeArmstrong
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int n = in.nextInt ( );

        System.out.println ( "Is the entered number Armstrong?" );
        System.out.println ( isArmstrong ( n ) );

        System.out.println ( "Is the entered number Prime?" );
        System.out.println ( isPrime ( n ) );
    }

    static boolean isPrime ( int n )
    {
        int flag = 0;
        for ( int i = 2 ; i <= Math.sqrt ( n ) ; i++ )
        {
            if ( n % i == 0 )
                flag++;
        }
        if ( flag == 0 )
        {
            return true;
        } else
        {
            return false;
        }


    }

    static boolean isArmstrong ( int n )
    {
        int m;
        m = n;
        int p = 0, rem = 0, count = 0;
        double a = 0, b = 0;
        for ( m = m; m > 0 ; m = m / 10 ) {
            rem = m % 10;
            count++;
        }
        int t = 0;
        t = n;
        for ( t = t; t > 0 ; t = t / 10 ) {
            p = t % 10;
            a = Math.pow ( p , count );
            b = b + a;
        }
        if ( b == n ) {
            return true;
        } else {
            return false;
        }
    }

}
