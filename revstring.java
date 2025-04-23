import java.util.Scanner;

public class revstring
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a string: " );
        String str = in.nextLine ();
        String strrev="";char ch='\0';
        for(int i=str.length ()-1;i>=0;i--)
        {
            ch = str.charAt ( i );
            strrev = strrev + ch;
        }
        System.out.println ( strrev );
    }
}
