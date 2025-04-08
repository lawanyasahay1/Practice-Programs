import java.util.Scanner;

public class Power {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter base:" );
        int b = in.nextInt ();
        System.out.println ( "Enter exponent:" );
        int e = in.nextInt ();
        int r = (int) Math.pow ( b,e );
        System.out.println ( "Result:"+r );
    }
}
