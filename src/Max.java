import java.util.Scanner;

public class Max 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, greaterOfTwo, greaterOfTthree, choice;
        boolean response = true;
                
        do
        {
            System.out.println("Enter the 1st number: ");
            num1 = input.nextInt();
            System.out.println("Enter the 2nd number: ");
            num2 = input.nextInt();
            System.out.println("Enter the 3rd number: ");
            num3 = input.nextInt();

            greaterOfTwo = GreaterNum(num1, num2);
            System.out.println("The greater number is: "+ greaterOfTwo +".");

            greaterOfTthree = GreaterNum(num1, num2, num3);
            System.out.println("The greater number is: "+ greaterOfTthree +".");

            System.out.println(" ");
            System.out.println("Do you want to run the program again?\n1. Yes.\n2. No.");
            choice = input.nextInt();
            response = OnOff(choice);            

        } while (response);
        System.out.println("Take care, bye, bye!");
    }
    static int GreaterNum (int num1In, int num2In)
    {
        if (num1In > num2In) 
        {
            return num1In;
        } else 
        {
            return num2In;
        }        
    }
    static int GreaterNum (int num1In, int num2In, int num3In)
    {
        int result = num1In;
        if (num2In > result)
        {
            result = num2In;
        }
        if (num3In > result)
        {
            result = num3In;
        }
        return result;
    }
    static boolean OnOff (int choiceIn)
    {
        if (choiceIn == 1)
        {
            return true;
        } else 
        {
            return false;
        }
    }
}
