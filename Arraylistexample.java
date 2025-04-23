import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );

        ArrayList <Integer> list = new ArrayList<> (  );
        list.add ( 23 );
        list.add ( 24 );
        list.add ( 25 );

        list.set ( 0,22 );
        list.remove ( 2);
        for ( int i=0;i<5;i++ )
        {
            list.add(in.nextInt ());
        }
        System.out.println ( list );
        for ( int i=0;i<5;i++ )
        {
            System.out.println (list.get ( i ));
        }

        System.out.println (list.contains ( 25 ) );
        System.out.print ( list );
    }
}
