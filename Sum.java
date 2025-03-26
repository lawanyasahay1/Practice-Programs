import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum of 2 numbers:"+sum);
    }
}
