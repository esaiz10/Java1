import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            String validationMessage = validatePassword(password);
            if (validationMessage.equals("Valid")) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println("Invalid password: " + validationMessage);
            }
        }

        scanner.close();
    }

    public static String validatePassword(String password) {
        int upperCount = 0, lowerCount = 0, digitCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
            else if (Character.isLowerCase(c)) lowerCount++;
            else if (Character.isDigit(c)) digitCount++;
        }

        if (upperCount < 2) return "Must contain at least two uppercase letters.";
        if (lowerCount < 3) return "Must contain at least three lowercase letters.";
        if (digitCount < 1) return "Must contain at least one digit.";

        return "Valid";
    }
}

