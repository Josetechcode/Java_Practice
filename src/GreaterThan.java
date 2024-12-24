import java.util.Scanner;

// Variable Scope, page 121

public class GreaterThan {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        int num1, num2;

        while (loop) {
            System.out.print("Enter the first number: ");
            num1 = keyboard.nextInt();            
            System.out.print("Enter the second number: ");
            num2 = keyboard.nextInt();

            GetGreater(num1, num2);

            System.out.println("Do you want to run the program again?:\n1. Yes.\n2. No.");
            int choice = keyboard.nextInt();

            if (choice == 1) {
                loop = true;
            } else if (choice == 2) {
                loop = false;
                System.out.println("The program has ended. Take care, bye , bye.");
            } else {
                loop = false;
                System.out.println("You've entered an invalid value and the program has ended. Take care, bye , bye.");
            }
        }
    }
    static void GetGreater (int num1Int, int num2Int) {
        if (num1Int > num2Int) {
            System.out.print("The first one is the greater number.");
        } else if (num1Int < num2Int) {
            System.out.print("The second one is the greater number.");
        } else {
            System.out.print("The numbers have the same value.");
        }
    }
}