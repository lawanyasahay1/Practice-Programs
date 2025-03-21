import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println("Enter a number to find occurrence:");
        int a = in.nextInt();
        int count =0;
        for(int i=0;i<=n;i++)
        {
            int rem=n%10;
            if(rem==a)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("Occurrence:" +count);
    }
}
