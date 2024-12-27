import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ChatBot {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean Reply;
        double Result, value;
                
        do {
            // GREETING THE USER
            System.out.println("Hello, what's your name?:");
            String name = keyboard.nextLine();
            Greeting (name);

            // DISPLAYING MENU AND PROMPTING THE USER WHAT THEY WANT TO DO
            System.out.println("Choose the option that better fits your request:\n1. Conver USD to COP.\n2. Convert COP to USD.");
            int choice = keyboard.nextInt();
            do {
            if (choice == 1) {
                System.out.println("Enter the value in USD to convert to COP: ");
                value = keyboard.nextDouble();                
            } else {
                System.out.println("Enter the value in COP to convert to USD: ");
                value = keyboard.nextDouble();                
            }
            } while (choice != 1 & choice != 2);
            Result = Menu(choice, value);
            System.out.println(Result);
            
            int Prompt;
            System.out.println("Do you want to make another conversion [1-2]?\n1. Yes.\n2. No.");
            Prompt = keyboard.nextInt();

            do {
                System.out.println("Enter a valid value [1-2]?\n1. Yes.\n2. No.");
                Prompt = keyboard.nextInt();
            } while (Prompt != 1 & Prompt != 2);
            Reply = Continue(Prompt);

        } while (Reply);
    }
    static void Greeting (String nameIn) {
        System.out.println("Hello, "+ nameIn +". I hope your doing well.");
    }
    static double Menu (int choiceIn, double valueIn) {

        if (choiceIn == 1) {
            return valueIn * 4392.5;
        } else {
            return (valueIn / 4392.5);
        } 
        // else if (choiceIn != 1 || choiceIn != 2) {
        //     double Empty = 0;
        //     return System.out.println("You entered an invalid option."+ Empty);            
        // }
    }
    static boolean Continue(int replyIn) {
        if (replyIn == 1) {
            return true;
        } else {
            return false;
        }
    }
}