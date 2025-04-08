import java.util.Scanner;

public class battingavg
{
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter total runs scored:" );
        int runs = in.nextInt ();
        System.out.println ( "Total Number of Times Out: " );
        int nto = in.nextInt ();
        float bavg = (float) (runs)/(nto);
        System.out.println ( "Batting average: "+bavg );

    }
}

