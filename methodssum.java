import java.util.Scanner;

public class methodssum
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter two numbers: " );
        int a = in.nextInt ();
        int b = in.nextInt ();
        System.out.println ( "Sum: "+sum(a,b) );
        System.out.println ( "Product: "+prod(a,b) );
    }

    static int sum(int a,int b)
    {
       int sums=a+b;
       return sums;
    }
    static int prod(int a,int b)
    {
        int prod=a*b;
        return prod;
    }
}
