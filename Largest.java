import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max= Math.max(c,Math.max(a,b));

        System.out.println("Maximum number is:" + max);
    }
}