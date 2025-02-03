import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum talk minutes needed: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter maximum text messages needed: ");
        int texts = scanner.nextInt();

        System.out.print("Enter maximum gigabytes of data needed: ");
        int data = scanner.nextInt();

        String plan;
        int price;

        if (data > 0) {
            if (data < 3) {
                plan = "Plan E";
                price = 79;
            } else {
                plan = "Plan F";
                price = 87;
            }
        } else if (minutes < 500) {
            if (texts == 0) {
                plan = "Plan A";
                price = 49;
            } else {
                plan = "Plan B";
                price = 55;
            }
        } else {
            if (texts < 100) {
                plan = "Plan C";
                price = 61;
            } else {
                plan = "Plan D";
                price = 70;
            }
        }

        System.out.println("The best plan for you is " + plan + " at $" + price + " per month.");

        scanner.close();
    }
}
