public class CountSpaces {
    public static void main(String[] args) {
        String quote = "The only limit to our realization of tomorrow is our doubts of today.";

        int spaceCount = 0;
        for (char c : quote.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("The quote contains " + spaceCount + " spaces.");
    }
}

