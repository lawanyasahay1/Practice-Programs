import java.util.Scanner;

public class FunctionsSum {
    public static void main ( String[] args ) {
         sum();

         int ans = sum1();
         System.out.println ( "Sum1: "+ans );

        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int num1 = in.nextInt ();
        System.out.println ( "Enter a number:" );
        int num2 = in.nextInt ();
        int ans2 = sum2 (num1,num2);
        System.out.println ( "Sum2 : "+ans2 );
    }
    static void sum ()
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int num1 = in.nextInt ();
        System.out.println ( "Enter a number:" );
        int num2 = in.nextInt ();
        int sum = num1+num2;
        System.out.println ( "Sum : " + sum );
    }
    static int sum1 ()
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int num1 = in.nextInt ();
        System.out.println ( "Enter a number:" );
        int num2 = in.nextInt ();
        int sum2 = num1+num2;
        return sum2;
    }

    static int sum2(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
}
