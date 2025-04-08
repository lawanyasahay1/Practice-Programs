import java.util.Scanner;
import java.math.*;

public class Armstrong {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int n = in.nextInt ( );
        int temp = 0;
        temp = n;
        int p = 0, rem = 0, count = 0;
        double a = 0, b = 0;
        for ( temp = temp; temp > 0 ; temp = temp / 10 ) {
            rem = temp % 10;
            count++;
        }
        int temp1 = 0;
        temp1 = n;
        for ( temp1 = temp1; temp1 > 0 ; temp1 = temp1 / 10 ) {
            p = temp1 % 10;
            a = Math.pow ( p , count );
            b = b + a;
        }
        if ( b == n ) {
            System.out.println ( "Armstrong Number" );
        } else {
            System.out.println ( "Not an Armstrong Number" );
        }

    }
}
