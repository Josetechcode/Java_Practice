import java.util.Scanner;
import java.util.Random;

public class TheMethods {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int reply;
        char choice;
        
        do {
            System.out.println("What do you want to be shown?:\n1. Ramdom number.\n2. Default message.");
            reply = keyboard.nextInt();

            if (reply == 1) {
                System.out.println(random.nextInt(100) + 1);
            } else {
                RandomMessage();
            }
            System.out.println("Do you want to run the program again [Y/N]?: ");
            choice = keyboard.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thanks for coming by. Have a good one!");
    }
    static void RandomMessage () {
        System.out.println("This is a ramdom message.");
    }
}