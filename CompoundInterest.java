import java.util.Scanner;

public class CompoundInterest
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Principal, rate, time :" );
        float p = in.nextFloat ();
        float r = in.nextFloat ();
        float t = in.nextFloat ();
        float a = (float) (p*(Math.pow ( (1+(r/100)),t )));
        float ci = a-p;
        System.out.println ( "Amount:" +a );
        System.out.println ( "CI :" +ci );
    }
}
