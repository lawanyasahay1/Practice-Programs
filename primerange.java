import java.util.Scanner;

public class primerange
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int a = in.nextInt ( );
        System.out.println ( "Enter a number:" );
        int b = in.nextInt ( );
        primerange ( a , b );
    }
    static void primerange(int a, int b)
    {
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<=Math.sqrt ( i );j++)
            {
                if(i%j!=0)
                    System.out.println ("The prime nos. are: "+ i );
            }
        }
    }
}
