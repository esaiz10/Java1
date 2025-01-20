import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_PRICE = 3.25;
        final double INDIVIDUAL_PRICE = 0.45;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs in your order: ");
        int totalEggs = scanner.nextInt();

        int dozens = totalEggs / 12;
        int looseEggs = totalEggs % 12;

        // Calculate total cost
        double totalCost = (dozens * DOZEN_PRICE) + (looseEggs * INDIVIDUAL_PRICE);


        System.out.printf("You ordered %d eggs. That's %d dozen at $%.2f per dozen and %d loose eggs at %.2f cents each for a total of $%.2f.%n",
                totalEggs, dozens, DOZEN_PRICE, looseEggs, INDIVIDUAL_PRICE, totalCost);

    }
}
