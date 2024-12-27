import java.util.Scanner;

public class Methods {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        char check;

        do {
            int choice;

            System.out.println("What do you want to do?\n1. ºC to ºF.\n2. ºF to ºC.");
            choice = keyboard.nextInt();
            
            if (choice == 1) {
                System.out.println("Enter temperature in ºC: ");
                float Celsius = keyboard.nextInt();
                // Celsius = CelsiusToFahrenheit(Celsius);
                System.out.println(CelsiusToFahrenheit(Celsius)+"ºF.");
            } else if (choice == 2) {
                System.out.println("Enter temperature in ºF: ");
                float Fahrenheit = keyboard.nextInt();
                // Fahrenheit = FahrenheitToCelsius(Fahrenheit);
                System.out.println (FahrenheitToCelsius(Fahrenheit)+"ºC.");
            } else {
                System.out.println("Error: You've entered an valid option (1 or 2).");                
            }
            System.out.println("Do you still want to convert a value? (Y/N)");
            check = keyboard.next().charAt(0); 
        } while (check == 'Y' || check == 'y');

        System.out.println("Thank you for coming by. Merry Christmas!");

    }
    static float CelsiusToFahrenheit (float Celsius) {
        return Celsius * 9/5 +32;        
    }
    static float FahrenheitToCelsius (float Fahrenheit) {
        return (Fahrenheit - 32) * 5/9;        
    }
}