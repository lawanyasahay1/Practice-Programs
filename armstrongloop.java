import java.util.Scanner;

public class armstrongloop
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );

        System.out.println ( "Enter a number:" );
        int n = in.nextInt();

        int count=1, sum=0;
        int n1=0,n2=0;
        n2=n;
        n1=n;

        for ( int i=0;i<n1;i++ )
        {
            int dig = n1%10;
            count++;
            n1=n1/10;
        }

        for ( n2=n2;n2>0;n2=n2/10 )
        {
            int dig1 = n2%10;
            int dig2 = (int) Math.pow ( dig1,count );
            sum = sum + dig2;
        }

        if(sum==n)
            System.out.println ( "It's an armstrong number" );
        else
            System.out.println ( "It's not an armstrong number" );


    }
}
