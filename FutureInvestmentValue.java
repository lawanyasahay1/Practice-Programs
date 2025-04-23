import java.util.Scanner;

public class FutureInvestmentValue
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter present value,time,rate:" );
        float pv = in.nextFloat ( );
        float n = in.nextFloat ( );
        float r = in.nextFloat ( );
        
        double fv = pv * Math.pow ((1+r),n);

        System.out.println ( "Enter present future value: " +fv);

        
    }
}
