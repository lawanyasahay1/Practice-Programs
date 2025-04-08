import java.util.Scanner;

public class Swapname
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.print ( "Enter Name: " );
        String name = in.nextLine();
        String newname = change (name);
        System.out.println ( "Swapped name: "+newname );
    }

    static String change(String name1)
    {
        name1 = "Ananya";
        return name1;
    }
}
