import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = scanner.nextInt();
        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = scanner.nextInt();

        double totalAdultMealCost = adultMeals * ADULT_MEAL_PRICE;
        double totalChildMealCost = childMeals * CHILD_MEAL_PRICE;
        double totalCost = totalAdultMealCost + totalChildMealCost;


        System.out.printf("Total for adult meals: $%.2f%n", totalAdultMealCost);
        System.out.printf("Total for child meals: $%.2f%n", totalChildMealCost);
        System.out.printf("Total for all meals: $%.2f%n", totalCost);

    }
}