import java.util.Scanner;

public class Commission
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the commission percentage:" );
        float cp = in.nextFloat ();
        System.out.println ( "Enter the sale:" );
        float sale = in.nextFloat ();
        float tc = (float) ((sale)*(cp/100));
        System.out.println ( "Total commission :" +tc );
    }
}
