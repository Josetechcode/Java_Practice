import java.util.Scanner;

public class ChatBot {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean Reply;
        double Result, value;
        // GREETING THE USER
        System.out.println("Hello, what's your name?:");
        String name = keyboard.nextLine();
        Greeting (name);
                
        do {
            // DISPLAYING MENU AND PROMPTING THE USER WHAT THEY WANT TO DO
            System.out.println("Choose the option that better fits your request:\n1. Conver USD to COP.\n2. Convert COP to USD.");
            int choice = keyboard.nextInt();
            while (choice != 1 & choice != 2) {
                System.out.println("Enter a valid option:\n1. Conver USD to COP.\n2. Convert COP to USD.");
                choice = keyboard.nextInt();
            }
            if (choice == 1) {
                System.out.println("Enter the value in USD to convert to COP: ");
                value = keyboard.nextDouble();                
            } else {
                System.out.println("Enter the value in COP to convert to USD: ");
                value = keyboard.nextDouble();                
            }
            Result = ShowMenu(choice, value);
            System.out.println(Result);
            System.out.println("----------------------------------------------");
            
            System.out.println("Do you want to make another conversion [1-2]?\n1. Yes.\n2. No.");
            int Prompt = keyboard.nextInt();
            while (Prompt != 1 & Prompt != 2) {            
                System.out.println("Enter a valid value [1-2]:\n1. Yes.\n2. No.");
                Prompt = keyboard.nextInt();
            }
            Reply = OnOff(Prompt);
        } while (Reply);
        System.out.println("The program is OFF. Take care, bye, bye.");
    }

    static void Greeting (String nameIn) {
        System.out.println("Hello, "+ nameIn +". I hope your doing well.");
    }

    static double ShowMenu (int choiceIn, double valueIn) {
        if (choiceIn == 1) {
            return valueIn * 4392.5;
        } else {
            return (valueIn / 4392.5);
        } 
    }

    static boolean OnOff (int replyIn) {
        if (replyIn == 1) {
            return true;
        } else {
            return false;
        }
    }
}