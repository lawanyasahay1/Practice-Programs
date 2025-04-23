import java.util.Scanner;

public class AVG
{
    public static void main ( String[] args )
    {
        int sum=0;
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter number of entries :" );
        int n = in.nextInt ();
        System.out.println ( "Enter the numbers :" );
        for(int i=0;i<n;i++)
        {
            int n1=in.nextInt ();
            sum=sum+n1;
        }
        double avg = sum/n;
        System.out.println ( "Sum:" +sum );
        System.out.println ( "Average:" +avg );
    }
}
