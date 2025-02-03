import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years;
        double annualSavings;

        // Prompt for valid number of years
        do {
            System.out.print("Enter the number of years until retirement: ");
            years = scanner.nextInt();
            if (years <= 0) {
                System.out.println("Please enter a positive number of years.");
            }
        } while (years <= 0);

        // Prompt for valid annual savings amount
        do {
            System.out.print("Enter the amount you can save annually: ");
            annualSavings = scanner.nextDouble();
            if (annualSavings <= 0) {
                System.out.println("Please enter a positive savings amount.");
            }
        } while (annualSavings <= 0);

        double totalSavings = years * annualSavings;
        System.out.println("Total savings at retirement: $" + totalSavings);

        scanner.close();
    }
}