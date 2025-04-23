import java.util.Scanner;

public class Allprogramsinone
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a number:" );
        int a = in.nextInt ();
        System.out.println ( "Enter a number:" );
        int b = in.nextInt ();
        System.out.println ( "Enter a number:" );
        int c = in.nextInt ();
        circle(a);
        prime(a);
        marks(a);
        factorial(a);
        palindrome(a);
        pythagorean(a,b,c);
        printPrimeRange(a,b);
        sumn(a);


    }

    static void pythagorean ( int a , int b , int c )
    {
        if ( ((a*a+b*b)==(c*c)) || ((c*c+b*b)==(a*a)) || ((a*a+c*c)==(b*b)) )
        {
            System.out.println ( "Pythagorean Triplet" );
        }
        else
        {
            System.out.println ( "Not a Pythagorean Triplet" );
        }
    }

    static void circle(int a)
    {
        double circ = (double) 2*Math.PI*a;
        double area = Math.PI*a*a;
        System.out.println ( "Circumference: "+circ+" Area :"+area );
    }
    static void prime(int a)
    {
        int flag=0;
        for(int i=2;i<=Math.sqrt ( a );i++)
        {
            if(a%i==0)
                flag++;
        }
        if(flag==0)
            System.out.println ( "Prime" );
        else
            System.out.println ( "Not Prime" );
    }

    static void marks(int a)
    {
        char grade='\0';
        if(a>=91 && a<=100)
        {
            grade='O';
        }
        if(a>=81 && a<=90)
        {
            grade='A';
        }
        if(a>=71 && a<=80)
        {
            grade='B';
        }
        if(a>=61 && a<=70)
        {
            grade='C';
        }
        if(a>=51 && a<=60)
        {
            grade='D';
        }
        if(a>=41 && a<=50)
        {
            grade='E';
        }
        if(a<=40)
        {
            grade='F';
        }
        System.out.println ( "Grade: " +grade );
    }

    static void factorial(int a)
    {
        int fact=1;
        if(a==0||a==1)
        {
            System.out.println ( "Invalid Input" );
        }

            for ( int i = 1 ; i <= a ; i++ )
            {
                fact = fact * i;
            }

        System.out.println ( "Factorial: " + fact );
    }

    static void palindrome(int a)
    {
        int b =a;
        int rev=0;
        for(a=a;a>0;a/=10)
        {
            int dig=a%10;
            rev = rev*10+dig;
        }
        if(b==rev)
            System.out.println ( "Palindrome " );
        else
            System.out.println ( "Not Palindrome" );
    }

    static void printPrimeRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (primerange(i)) {
                System.out.println("The prime number is: " + i);
            }
        }
    }

    static boolean primerange(int n) {
        if (n <= 1)
            return false;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    static void sumn(int a)
    {
        int sums=0;
        for(int i=0; i<=a;i++)
        {
            sums = sums + i;
        }
        System.out.println ( "Sum: " + sums );
    }




}
