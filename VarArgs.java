import java.util.Arrays;

public class VarArgs {
    public static void main ( String[] args ) {
    fun ( 2,3,4,5,5,56,54 );
    mul ( 2,3,"Lawanya" );
    }
    static void mul( int a,int b,String ...v)
    {
        System.out.println ( Arrays.toString(v) );
        System.out.println ( a);
        System.out.println ( b );


    }
    static void fun(int ...v)
    {
        System.out.println ( Arrays.toString(v) );
    }
}
