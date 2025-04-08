import java.util.Scanner;

class Project {
    String title;
    String description;
    String technologies;
    String githubLink;

    Project(String title, String description, String technologies, String githubLink) {
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.githubLink = githubLink;
    }

    public String toString() {
        return "Title: " + title +
                "\nDescription: " + description +
                "\nTechnologies: " + technologies +
                "\nGitHub Link: " + githubLink;
    }
}

public class SimpleProjectManagerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project[] projects = new Project[100]; // max 100 projects
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Project Manager ---");
            System.out.println("1. Add Project");
            System.out.println("2. View Projects");
            System.out.println("3. Search Project");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            if (choice == 1) {
                if (count >= projects.length) {
                    System.out.println("Project list is full.");
                    continue;
                }

                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Technologies: ");
                String tech = sc.nextLine();
                System.out.print("GitHub Link: ");
                String link = sc.nextLine();

                projects[count] = new Project(title, desc, tech, link);
                count++;
                System.out.println("Project added!");

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No projects to show.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println("\nProject " + (i + 1));
                        System.out.println(projects[i]);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter title to search: ");
                String search = sc.nextLine().toLowerCase();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (projects[i].title.toLowerCase().contains(search)) {
                        System.out.println("\n" + projects[i]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Project not found.");
                }

            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        System.out.println("Goodbye!");
    }
}
