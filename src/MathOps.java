import java.util.Scanner;
import java.time.LocalTime;

public class MathOps 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        char choice;

        do
        {
            System.out.println("What do you want to do: ");
            System.out.println("1. Convert COP to USD.");
            System.out.println("2. Being shown the current time.");
            System.out.println("3. Calculate a triangle area.");
            System.out.println("4. Quit.");
            System.out.println("Enter a number from 1 to 4.");

            choice = input.next().charAt(0);

            switch (choice) 
            {
                case '1':   System.out.println("The value in USD is:"+ Opc1());
                                         
                    break;
                case '2':   Opc2();               
                    break;  
                case '3':   System.out.println("The Area of the triangle is:"+ Opc3());             
                    break;
                case '4':                    
                    break;
            
                default: System.out.println("Enter a value from 1 to 4.");
                    break;
            }
        } while (choice != '4');
        System.out.println("Take care, bye, bye.");

    }
    static double Opc1 () 
    {
        Scanner input = new Scanner(System.in);
        double COP;
        System.out.println("Enter the value in COP: ");
        COP = input.nextDouble();
        return COP * 0.00023;
    }   
    static void Opc2 () 
    {
        LocalTime Time = LocalTime.now();
        System.out.println("Current time is: "+ Time);
    }   
    static double Opc3 () 
    {
        Scanner input = new Scanner(System.in);
        Double Base, Height;
        System.out.println("Enter the base of the triangle: ");
        Base = input.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        Height = input.nextDouble();
        return (Base * Height) / 2;
    }     
}