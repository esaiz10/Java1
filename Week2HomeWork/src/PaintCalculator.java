import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the room (in feet): ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room (in feet): ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the room (in feet): ");
        double height = scanner.nextDouble();

        double price = calculatePaintCost(length, width, height);
        System.out.printf("The total cost of paint is $%.2f%n", price);
    }

    public static double calculatePaintCost(double length, double width, double height) {
        double wallArea = calculateWallArea(length, width, height);
        double gallonsNeeded = calculateGallonsNeeded(wallArea);

        final double PRICE_PER_GALLON = 32.0;

        return gallonsNeeded * PRICE_PER_GALLON;
    }
    public static double calculateWallArea(double length, double width, double height) {
        return 2 * height * (length + width);
    }

    public static double calculateGallonsNeeded(double wallArea) {
        final double COVERAGE_PER_GALLON = 350.0;

        return wallArea / COVERAGE_PER_GALLON;
    }
}

