import java.util.Scanner;

public class ElectricityBill {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int n = in.nextInt ();
        float bill;
        if(n<=100)
        {

            bill= (float) ((n)*1.5);
            System.out.println ( "Bill: "+bill );
        }
        if(n>100 && n<300)
        {
            bill= (float) ((100*1.5)+((n-100)*2.5));
            System.out.println ( "Bill: "+bill );
        }
        else {
            bill= (float) ((100*1.5)+(200*2.5)+((n-300)*4.0));
            System.out.println ( "Bill: "+bill );
        }
    }
}
