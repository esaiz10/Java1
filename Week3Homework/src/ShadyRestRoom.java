import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Room Options: \n1 - Queen Bed ($125)\n2 - King Bed ($139)\n3 - King Bed with Pullout Couch ($165)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        int price;
        String roomType;

        switch (choice) {
            case 1:
                roomType = "Queen Bed";
                price = 125;
                break;
            case 2:
                roomType = "King Bed";
                price = 139;
                break;
            case 3:
                roomType = "King Bed with Pullout Couch";
                price = 165;
                break;
            default:
                roomType = "Invalid Choice";
                price = 0;
        }

        System.out.println("You selected: " + roomType);
        System.out.println("Price: $" + price);

        scanner.close();
    }
}