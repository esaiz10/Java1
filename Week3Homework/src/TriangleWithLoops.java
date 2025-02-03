import java.util.Scanner;

public class TriangleWithLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit integer: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Invalid input. Please enter a single-digit integer.");
        } else {
            for (int i = 1; i <= 7; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(number);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
