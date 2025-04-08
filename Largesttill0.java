import java.util.Scanner;

public class Largesttill0
{
    public static void main ( String[] args ) {
        {
            Scanner in = new Scanner ( System.in );
            System.out.println ( "Enter a numbers to find the largest number, press 0 to end entering numbers:" );
            int max=0,n;
            for(n = in.nextInt ();n!=0;n= in.nextInt ( ))
            {
                if(n>max)
                {
                    max=n;
                }
            }
            System.out.println ( max );
            in.close ();;
            }

        }
    }
