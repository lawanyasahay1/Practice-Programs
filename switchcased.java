import java.util.Scanner;

public class switchcased {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit:");
        String fruit = in.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red Fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter a valid fruit");
        }


    }
}
