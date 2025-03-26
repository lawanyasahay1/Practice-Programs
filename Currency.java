import java.util.Scanner;

public class Currency
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in rupees to convert into dollars:");
        float r = in.nextFloat();
        float d = (float) (r / 85.57);
        System.out.println("Rupees in Dollars:" + d);

    }
}
