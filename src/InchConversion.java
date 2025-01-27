import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value in inches: ");
        double inches = scanner.nextDouble();
        convertToFeet(inches);
        convertToYards(inches);
        scanner.close();
    }

    public static void convertToFeet(double inches) {
        double feet = inches / 12; // 12 inches in a foot
        System.out.printf("%.2f inches is equivalent to %.2f feet.%n", inches, feet);
    }
    public static void convertToYards(double inches) {
        double yards = inches / 36; // 36 inches in a yard
        System.out.printf("%.2f inches is equivalent to %.2f yards.%n", inches, yards);
    }
}