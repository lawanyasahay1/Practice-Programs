import javax.crypto.EncryptedPrivateKeyInfo;
import java.util.Scanner;

public class NPRNCR
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );

        System.out.println ( "Enter the total number of items:" );
        int n = in.nextInt ();
        System.out.println ( "Enter the total number of items to be selected from total number of items:" );
        int r = in.nextInt ();

        //factorial loop
        int nf =1,rf=1,nrf=1;

        for(int i=1;i<=n;i++)
        {
            nf = nf * i;
        }
        for(int j=1;j<=r;j++)
        {
            rf = rf * j;
        }
        for(int k=1;k<=(n-r);k++)
        {
            nrf = nrf * k;
        }

        double ncr = ((double) (nf) / ((rf) * (nrf))) ;
        double npr = (double) (nf) / (nrf);

            System.out.println ( "ncr:"+ ncr );
            System.out.println ( "npr:"+ npr );

    }
}
