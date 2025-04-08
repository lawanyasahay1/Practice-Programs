import java.util.Scanner;

public class Palindromestringnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string and a number for them to be Palindrome-d:");
        String st = in.nextLine();
        int num = in.nextInt();

        System.out.println("Enter 2 for string and 1 for number for them to be Palindrome-d:");
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
            {
                int n = 0;
                int rev = 0;
                n=num;
                for (n=n; n>0; n=n/10)
                {
                    int rem = n % 10;
                    rev = rev * 10 + rem;
                }
                System.out.println("Palindrome of: " + num + " is: " + rev);
            }
            break;
            case 2:
            {
                String rev1;
                int l=st.length();
                int i;
                String strrev ="";
                for (i=l-1;i>=0;i--)
                {
                    char ch = st.charAt(i);
                    strrev= strrev + ch;
                }
                System.out.println("Palindrome of: "+ st +" is: " + strrev);
            }
            break;
            default:
            {
                System.out.println("Invalid entry");
            }

        }

    }
}
