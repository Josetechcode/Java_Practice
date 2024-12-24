import java.util.Scanner;
public class test {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner (System.in);
        
        do {
            int number1, number2;

            System.out.println("Enter the first number: ");
            number1 = keyboard.nextInt();
            System.out.println("Enter the second number: ");
            number2 = keyboard.nextInt();

            int Total = GetAdd(number1, number2);
            System.out.println ("El resultado es "+Total+".");

            System.out.println ("Do you want to do another addition?: ");

        } while ();

    }
    static int GetAdd (int number1, int number2) {
        return number1 + number2;
    }
}
