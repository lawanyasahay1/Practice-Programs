public class SwapFunctions
{
    public static void main ( String[] args )
    {
        int a=1;
        int b=2;
        System.out.println ( "a: "+a+" b: "+b );
       swap (a,b);
    }
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println ( "a: "+a+" b: "+b );
    }
}
