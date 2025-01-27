import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the activity: ");
        String activity = scanner.nextLine();

        System.out.print("Enter the number of minutes spent: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter the year of the date: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month of the date (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day of the date: ");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        FitnessTracker tracker1 = new FitnessTracker(activity, minutes, date);

        FitnessTracker tracker2 = new FitnessTracker();

        System.out.println("\nFitness Tracker 1 Details:");
        System.out.println("Activity: " + tracker1.getActivity());
        System.out.println("Minutes: " + tracker1.getMinutes());
        System.out.println("Date: " + tracker1.getDate());

        System.out.println("\nFitness Tracker 2 Details (Default values):");
        System.out.println("Activity: " + tracker2.getActivity());
        System.out.println("Minutes: " + tracker2.getMinutes());
        System.out.println("Date: " + tracker2.getDate());

        scanner.close();
    }
}