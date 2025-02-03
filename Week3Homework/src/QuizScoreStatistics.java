import java.util.Scanner;

public class QuizScoreStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a quiz score (99 to stop): ");
            int score = scanner.nextInt();

            if (score == 99) {
                break;
            }

            if (score < 0 || score > 10) {
                System.out.println("Invalid score. Please enter a score between 0 and 10.");
                continue;
            }

            sum += score;
            count++;

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Number of scores entered: " + count);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.println("Average score: " + average);
        } else {
            System.out.println("No valid scores were entered.");
        }

        scanner.close();
    }
}