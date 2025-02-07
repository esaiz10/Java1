import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for three names
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter the third name: ");
        String name3 = scanner.nextLine();

        // Generate and display all possible two-name combinations
        System.out.println("Here are the possible two-name combinations:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);

        scanner.close();
    }
}