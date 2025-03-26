import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter empID and dept:");
        int empID = in.nextInt();
        String dept = in.next();
        switch (empID)
        {
            case 1:
                System.out.println("Lawanya Sahay");
                break;
            case 2:
                System.out.println("Ananya Sahay");
                break;
            case 3:
                System.out.println("Shreyansh Sahay");
                switch (dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter valid dept");
                }
                break;
            default:
                System.out.println("Enter valid empID");
        }
    }
}
