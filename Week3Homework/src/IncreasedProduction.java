import java.util.Scanner;

public class IncreasedProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of parts currently produced per month: ");
        double currentProduction = scanner.nextDouble();

        double goal = 10000;
        boolean goalReached = false;

        for (int month = 1; month <= 24; month++) {
            currentProduction *= 1.06; // Increase by 6%
            System.out.printf("Month %d: %.2f parts%n", month, currentProduction);

            if (currentProduction >= goal && !goalReached) {
                System.out.println("Goal of 10,000 parts reached in month " + month);
                goalReached = true;
            }
        }

        if (!goalReached) {
            System.out.println("The worker will not reach the goal within 24 months.");
        }

        scanner.close();
    }
}