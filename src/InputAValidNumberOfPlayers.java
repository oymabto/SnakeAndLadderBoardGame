import java.util.Scanner;

public class InputAValidNumberOfPlayers {
    public static void main(String[] args) {
        final int minimumNumberOfPlayers = 2;
        final int maximumNumberOfPlayers = 4;
        final int maximumNumberOfAttempts = 4;

        Scanner scanner = new Scanner(System.in);
        int numPlayers = 0;
        int attempts = 0;

        // Prompt the user to enter the number of players
        while (numPlayers < minimumNumberOfPlayers || numPlayers > maximumNumberOfPlayers) {
            System.out.print("Enter the number of players for your game (2-4): ");
            int input = scanner.nextInt();
            numPlayers = input;

            if (numPlayers < minimumNumberOfPlayers || numPlayers > maximumNumberOfPlayers) {
                attempts++;
                System.out.println("Invalid input. Please try again.");
                if (attempts >= maximumNumberOfAttempts) {
                    System.out.println("Bad Attempt " + attempts + "! You have exhausted all your chances. The program will terminate!");
                    break;
                } else {
                    System.out.println("Bad Attempt " + attempts + " - Invalid # of players. Please enter a # between 2 and 4 inclusively.");
                    if (attempts == maximumNumberOfAttempts - 1) {
                        System.out.println("This is your last attempt.");
                    }
                }
            }
        }
    }
}
