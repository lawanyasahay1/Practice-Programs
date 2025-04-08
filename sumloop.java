import java.util.Scanner;

public class sumloop
{
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int sum=0;
        System.out.println ("Enter the number of numbers to be entered:");
        int a=in.nextInt ();
        System.out.println ("Enter the numbers:");
        for ( int i=1;i<=a;i++ )
        {
            int n = in.nextInt ();
            sum = sum+n;
        }
        System.out.println ( "Sum: "+sum );
    }
}
