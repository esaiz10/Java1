import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite quote: ");
        String quote = scanner.nextLine();

        int spaceCount = 0;
        for (char c : quote.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Your quote contains " + spaceCount + " spaces.");

        scanner.close();
    }
}
