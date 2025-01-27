import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        double squareRoot = Math.sqrt(intValue);
        System.out.println("Square root of " + intValue + " is: " + squareRoot);

        double randomNumber = Math.random() * intValue;
        System.out.println("Random number between 0 and " + intValue + " is: " + randomNumber);

        double floorValue = Math.floor(doubleValue);
        double ceilingValue = Math.ceil(doubleValue);
        long roundValue = Math.round(doubleValue);

        System.out.println("Floor of " + doubleValue + " is: " + floorValue);
        System.out.println("Ceiling of " + doubleValue + " is: " + ceilingValue);
        System.out.println("Rounded value of " + doubleValue + " is: " + roundValue);

        double largerValue = Math.max(intValue, (int) doubleValue);
        double smallerValue = Math.min(intValue, (int) doubleValue);

        System.out.println("Larger of " + intValue + " and " + doubleValue + " is: " + largerValue);
        System.out.println("Smaller of " + intValue + " and " + doubleValue + " is: " + smallerValue);

        scanner.close();
    }
}
