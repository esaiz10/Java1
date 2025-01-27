import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DaysTilNextMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the month, day, and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        LocalDate currentDate = LocalDate.of(year, month, day);


        LocalDate nextMonthFirstDay = currentDate.plusMonths(1).withDayOfMonth(1);

        long daysUntilNextMonth = currentDate.until(nextMonthFirstDay).getDays();

        String nextMonthName = nextMonthFirstDay.getMonth().toString();

        System.out.println("There are " + daysUntilNextMonth + " days until " + nextMonthName + " starts.");

        scanner.close();
    }
}