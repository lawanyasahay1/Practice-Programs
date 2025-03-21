import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number upto which you want Fibonacci Series:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int temp;
        while (count <= n)
        {
            temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
