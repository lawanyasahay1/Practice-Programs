import java.util.Scanner;

public class sums
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the no. of entries: " );
        int n = in.nextInt ();
        int s=0,s1=0,s2=0;
        System.out.println ( "Enter the numbers " );
        for ( int i =0 ; i<n;i++ )
        {
            int e = in.nextInt ();
            if ( e == 0)
            {
                System.out.println ( "User Entered Zero" );
            }
            if(e<0)
            {
                s=s+e;
            }
            if(e>0 && e%2==0)
            {
                s1=s1+e;
            }
            if(e>0 && e%2!=0)
            {
                s2=s2+e;
            }
        }
        System.out.println ("Sum of negative numbers :"+s);
        System.out.println ("Sum of positive even numbers :"+s1);
        System.out.println ("Sum of positive odd numbers :"+s2);
    }
}
