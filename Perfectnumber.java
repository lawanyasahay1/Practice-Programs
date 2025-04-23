import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        int sum = 1; // Start from 1 because it's always a divisor (except for n=1)

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                int otherDivisor = n / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }

        if (n != 1 && sum == n) {
            System.out.println(n + " is a Perfect number.");
        } else {
            System.out.println(n + " is an Imperfect number.");
        }
    }
}
