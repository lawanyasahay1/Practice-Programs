import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        System.out.println("The multiplication table is:");
        for(int i=1;i<11;i++){
            int p = i*n;
            System.out.println(p);
        }
    }
}
