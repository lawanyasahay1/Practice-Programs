import java.util.Scanner;

public class Fibonacci1 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number upto which you want the Fibonacci Series:" );
        int n =in.nextInt ();
        int a=0;
        int b=1;
        int temp=0;
        for(int i=0;i<=n;i++)
        {
            System.out.println ( a );
            temp = b+a;
            a=b;
            b=temp;

        }
    }
}
