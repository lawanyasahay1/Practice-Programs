import java.util.Scanner;

public class vowel
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a letter:" );
        char ch = in.next ().charAt ( 0 );
        int flag=0;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
        {
            flag++;
        }
        if (flag!=0)
        {
            System.out.println ( "Vowel" );
        }
        else
        {
            System.out.println ( "Consonant" );

        }
    }
}
