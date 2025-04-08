import java.util.Scanner;

public class sumtill0 {
    public static void main ( String[] args ) {
        {
            Scanner in = new Scanner ( System.in );
            System.out.println ( "Enter numbers to sum them up and press 0 to end entering:" );
            int n, sum = 0;

            for ( n = in.nextInt ( ) ; n!=0 ; n = in.nextInt ( ) ) {
                sum += n;
            }
            System.out.println ( sum );
        }
    }
}
