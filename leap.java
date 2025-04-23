import java.util.Scanner;

public class leap
{
    public static void main ( String[] args )
    {
        int flag =0;
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a year: " );
        int y = in.nextInt ();
        if((y%4==0 && y%100!=0) || (y%400==0))
        {
            flag++;
        }
        if(flag!=0)
            System.out.println ( "Leap  Year" );
        else
            System.out.println ( "Not a leap year" );
    }
}
