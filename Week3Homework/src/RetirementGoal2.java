import java.util.Scanner;

public class RetirementGoal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the current balance and years until retirement
        System.out.print("Enter your current balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the number of years until retirement: ");
        int years = scanner.nextInt();

        // Annual interest rate
        double interestRate = 0.04; // 4%

        // Calculate the total amount with interest applied
        double totalAmount = balance;
        for (int i = 1; i <= years; i++) {
            totalAmount += totalAmount * interestRate; // Apply interest
        }

        // Display the result
        System.out.printf("Your balance after %d years with 4%% annual interest: $%.2f%n", years, totalAmount);

        // Close scanner
        scanner.close();
    }
}