import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main ingredient: ");
        String mainIngredient = scanner.nextLine();

        System.out.print("Enter the type of bread: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient(mainIngredient);
        sandwich.setBreadType(breadType);
        sandwich.setPrice(price);

        System.out.println("\nSandwich Details:");
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());

        scanner.close();
    }
}