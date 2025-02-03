import java.util.Scanner;

public class DiagonalNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit integer: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Invalid input. Please enter a single-digit integer.");
        } else {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(number);
            }
        }

        scanner.close();
    }
}