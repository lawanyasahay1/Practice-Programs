import java.util.Scanner;

public class Average {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the number of numbers to be entered:" );
        int n = in.nextInt ( );
        System.out.println ( "Enter the numbers:" );
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            int n1 = in.nextInt ();
            sum = sum + n1;
        }
        System.out.println ( "Sum:"+sum );
        float avg=0;
        avg= (float) (sum/n);
        System.out.println ( "Avg:" +avg );


    }
}
