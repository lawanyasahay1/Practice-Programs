import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year:");
        int y = in.nextInt();
        if (y % 4 == 0)
        {
            System.out.println("Leap Year");
        } else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
