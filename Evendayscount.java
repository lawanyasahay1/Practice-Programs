import java.util.Scanner;

public class Evendayscount
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the month: " );
        int m = in.nextInt ();
        switch (m)
        {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12 :
        {
            int count = 0;
            for(int i=1;i<=31;i++)
            {
                if (i%2==0)
                {
                    count ++;
                }
            }
            System.out.println ( count + " Days");
            break;
        }

            case 4 : case 6 : case 9 : case 11 :
        {
            int count = 0;
            for(int i=1;i<=30;i++)
            {
                if (i%2==0)
                {
                    count ++;
                }
            }
            System.out.println ( count + " Days");
            break;
        }

            case 2 :
        {
            int count = 0;
            for(int i=1;i<=28;i++)
            {
                if (i%2==0)
                {
                    count ++;
                }
            }
            System.out.println ( count + " Days");
            break;
        }

            default:
            {
                System.out.println ( "Invalid input" );
            }
        }
    }
}
