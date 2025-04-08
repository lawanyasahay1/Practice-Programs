import java.util.Scanner;

public class Factors {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int n = in.nextInt ();
        int flag=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println ( "Factors of: "+n+" are: "+i );
            }
        }

    }
}
