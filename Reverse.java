import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int rem,num=0;
        for(n=n;n>0;n=n/10)
        {
            rem = n%10;
            num = num*10+rem;

        }
        System.out.println("Reverse is:" +num);
    }
}
