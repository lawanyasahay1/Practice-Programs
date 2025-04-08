import java.util.Scanner;

public class Discount {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the price:" );
        float p = in.nextFloat ();
        System.out.println ( "Enter the discount:" );
        float d = in.nextFloat ();
        float dp = (float) (d/100)*(p);
        float fp = p-dp;
        System.out.println ( "Discount:" +d );
        System.out.println ( "Discounted Price:" +fp );
    }
}
