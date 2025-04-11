import java.util.Scanner;

public class CGPA
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        String name = "";
        float sum = 0, gp = 0, sgpa = 0, cgpa=0, sumcp = 0, sumsgpa = 0.0F;
        float cp = 0;
        float c = 0;

        System.out.print ( "Enter number of semesters : " );
        float sn = in.nextFloat ( );

        for ( int j = 0 ; j < sn ; j++ )
        {
            System.out.print ( "Enter semester : " );
            float s = in.nextFloat ( );

            System.out.print ( "Enter number of subjects : " );
            float n = in.nextFloat ( );
            in.nextLine();

            for (float i = 0 ; i < n ; i++ )
            {
                System.out.println ( "Enter name of subject : " );
                name = in.nextLine ( );

                System.out.println ( "Enter credits of subject : " );
                c = in.nextFloat ( );
                sum = sum + c;

                System.out.println ( "Enter marks of subject : " );
                float m = in.nextFloat ( );
                in.nextLine ( );

                if ( m >= 90 && m <= 100 )
                {
                    String g = "O";
                    gp = 10;

                }
                if ( m >= 80 && m <= 89 )
                {
                    String g = "A+";
                    gp = 9;
                }
                if ( m >= 70 && m <= 79 )
                {
                    String g = "A";
                    gp = 8;
                }
                if ( m >= 60 && m <= 69 )
                {
                    String g = "B+";
                    gp = 7;
                }
                if ( m >= 55 && m <= 59 )
                {
                    String g = "B";
                    gp = 6;
                }
                if ( m >= 50 && m <= 54 )
                {
                    String g = "C";
                    gp = 5;
                }
                if ( m >= 40 && m <= 49 )
                {
                    String g = "P";
                    gp = 4;
                }
                if ( m >= 0 && m <= 39 )
                {
                    String g = "F";
                    gp = 0;
                }

                cp = gp * c;

                sumcp = sumcp + cp;

                sgpa = (sumcp/sum);

                sumsgpa = sumsgpa + sgpa;

            }
            cgpa = (sumsgpa)/sn;

            System.out.println ( "CGPA: "+cgpa );
            System.out.println ( "SGPA: "+sgpa );

        }
    }
}
