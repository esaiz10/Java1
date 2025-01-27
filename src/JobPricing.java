import java.util.Scanner;

public class JobPricing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the job name: ");
        String jobName = scanner.nextLine();

        System.out.print("Enter the cost of materials: ");
        double materialCost = scanner.nextDouble();

        System.out.print("Enter the number of hours of work required: ");
        int workHours = scanner.nextInt();

        System.out.print("Enter the number of hours of travel time: ");
        int travelHours = scanner.nextInt();

        double estimatedCost = calculateJobCost(materialCost, workHours, travelHours);

        System.out.printf("The estimated cost for '%s' is: $%.2f%n", jobName, estimatedCost);

        scanner.close();
    }
    public static double calculateJobCost(double materialCost, int workHours, int travelHours) {
        final double WORK_HOURLY_RATE = 35.0;
        final double TRAVEL_HOURLY_RATE = 12.0;

        return materialCost + (workHours * WORK_HOURLY_RATE) + (travelHours * TRAVEL_HOURLY_RATE);
    }
}
