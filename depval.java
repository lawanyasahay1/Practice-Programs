import java.util.Scanner;

public class depval {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter value,time,rate");
        float v = in.nextFloat ( );
        float t = in.nextFloat ( );
        float r = in.nextFloat ( );
        float v1 = (float) (v*(Math.pow ( (1-(r/100)),t)));
        System.out.println ( "Value of Depreciation:" +v1  );
    }
}
