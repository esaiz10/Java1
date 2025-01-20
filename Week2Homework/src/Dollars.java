import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in dollars: ");
        int dollars = scanner.nextInt();

        int twenties = dollars / 20;
        int remainder = dollars % 20;

        int tens = remainder / 10;
        remainder %= 10;

        int fives = remainder / 5;
        remainder %= 5;

        int ones = remainder;

        System.out.printf("$%d can be broken down into:%n", dollars);
        System.out.printf("%d twenty(s)%n", twenties);
        System.out.printf("%d ten(s)%n", tens);
        System.out.printf("%d five(s)%n", fives);
        System.out.printf("%d one(s)%n", ones);
    }
}

