import java.util.Scanner;
import java.util.Random;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // creating the scanner object
        Random random = new Random(); // creating the random object

        int guess;
        int number = random.nextInt(5) + 1;
        boolean result = false;
        char reply;

        System.out.println("You have 3 attempts to guess the secret number which is between 1 and 5.");

            do {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Enter your guess.");
                    guess = keyboard.nextInt();

                    if (guess == number) {
                        result = true;
                        break;
                    } else if (guess < 1 || guess > 5) {
                        System.out.println("ERROR: Pick a number between 1 to 5.");
                    } 
                }

                if (result) {
                    System.out.println("You've guessed it. The secret number is: "+ number +".");
                } else {
                    System.out.println("You haven't guessed the number after 3 attempts.\nThe secret number was: "+ number +". Better luck next time.");
                }
            System.out.print("Do you want to play again [Y/N]? ");
            reply = keyboard.next().charAt(0);
            number = random.nextInt(5) + 1;
            result = false;


            } while (reply == 'Y' || reply == 'y');
        System.out.print("Thank you for playing. Have a good one!");

    }
}