import java.util.Scanner;

public class methodsmaxmin
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter 3 numbers: " );
        int a = in.nextInt ();
        int b = in.nextInt ();
        int c = in.nextInt ();
        System.out.println (max(a,b,c));
        System.out.println (min(a,b,c));
    }

    static int max(int a,int b,int c)
    {
        int maxm=0;
        {
            maxm = Math.max ( a,Math.max ( b,c ) );
        }
        return maxm;
    }

    static int min(int a,int b,int c)
    {
        int minm=0;
        {
            minm = Math.min ( a,Math.min ( b,c ) );
        }
        return minm;
    }
}
