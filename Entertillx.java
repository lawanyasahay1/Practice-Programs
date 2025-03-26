import java.util.Scanner;

public class Entertillx {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers for sum and press x to mark the end:");
        while (true)
            {
            String input = in.next();
            if (input.equals("x")) {
                break;
            }
            sum += Integer.parseInt(input);
            }
        System.out.println ("Total Sum: " + sum);
    }
}
