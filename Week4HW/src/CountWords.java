import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the input string using regex to match spaces and punctuation marks
        String[] words = input.trim().split("[\s.,;?!-]+");

        int wordCount = (input.trim().isEmpty()) ? 0 : words.length;
        System.out.println("Word count: " + wordCount);

        scanner.close();
    }
}