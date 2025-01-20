import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = scanner.nextInt();
        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = scanner.nextInt();


        double totalAdultMealRevenue = adultMeals * ADULT_MEAL_PRICE;
        double totalChildMealRevenue = childMeals * CHILD_MEAL_PRICE;

        double totalAdultMealCost = adultMeals * ADULT_MEAL_COST;
        double totalChildMealCost = childMeals * CHILD_MEAL_COST;

        double totalAdultMealProfit = totalAdultMealRevenue - totalAdultMealCost;
        double totalChildMealProfit = totalChildMealRevenue - totalChildMealCost;


        double grandTotalProfit = totalAdultMealProfit + totalChildMealProfit;

        System.out.printf("Total profit for adult meals: $%.2f%n", totalAdultMealProfit);
        System.out.printf("Total profit for child meals: $%.2f%n", totalChildMealProfit);
        System.out.printf("Grand total profit: $%.2f%n", grandTotalProfit);

    }
}