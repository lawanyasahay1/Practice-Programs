import java.util.Scanner;

public class SGPACGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float totalCredits = 0;
        float totalWeightedGP = 0;

        System.out.print("Enter number of semesters: ");
        int sn = Integer.parseInt(in.nextLine());

        for (int j = 1; j <= sn; j++) {
            System.out.println("\n--- Semester " + j + " ---");

            System.out.print("Enter number of subjects: ");
            int n = Integer.parseInt(in.nextLine());

            float semCredits = 0;
            float semWeightedGP = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter name of subject: ");
                String name = in.nextLine();

                System.out.print("Enter credits of subject: ");
                float c = Float.parseFloat(in.nextLine());

                System.out.print("Enter marks of subject: ");
                float m = Float.parseFloat(in.nextLine());

                float gp;
                String grade;

                if (m >= 90) {
                    gp = 10; grade = "O";
                } else if (m >= 80) {
                    gp = 9; grade = "A+";
                } else if (m >= 70) {
                    gp = 8; grade = "A";
                } else if (m >= 60) {
                    gp = 7; grade = "B+";
                } else if (m >= 55) {
                    gp = 6; grade = "B";
                } else if (m >= 50) {
                    gp = 5; grade = "C";
                } else if (m >= 40) {
                    gp = 4; grade = "P";
                } else {
                    gp = 0; grade = "F";
                }

                semCredits += c;
                semWeightedGP += gp * c;

                System.out.println("Grade for " + name + ": " + grade);
            }

            float sgpa = semWeightedGP / semCredits;
            System.out.printf("SGPA for semester %d: %.2f\n", j, sgpa);

            totalCredits += semCredits;
            totalWeightedGP += semWeightedGP;
        }

        float cgpa = totalWeightedGP / totalCredits;
        System.out.printf("\nFinal CGPA: %.2f\n", cgpa);

        in.close();
    }
}
