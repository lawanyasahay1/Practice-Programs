import java.util.Scanner;

public class distancetwopoints {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter x and y co-ordinates of Point 1: " );
        int x1 = in.nextInt ();
        int y1 = in.nextInt ();
        System.out.println ( "Enter x and y co-ordinates of Point 2: " );
        int x2 = in.nextInt ();
        int y2 = in.nextInt ();
        int d = (int) Math.sqrt ( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println ( "Enter x and y co-ordinates of Point 2: " );
        System.out.println ( "Distance: " +d );

    }
}
