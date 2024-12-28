// Page 151
import java.util.Scanner;

public class Test 
{
    public static void main (String [] args) 
    {
        double[] Grades;
        Grades = enterGrades();
        displayGrades(Grades);
    
        System.out.println("Take care, by, bye.");
    }
    static double[] enterGrades ()
    {
        Scanner input = new Scanner(System.in);
        double[] gradesOut = new double[3];

        for(int i = 0; i < gradesOut.length; i++)
        {
            System.out.println("Enter the grade number "+(i+1)+":");
            gradesOut[i] = input.nextDouble();
        }
        return gradesOut;
    }
    static void displayGrades (double[] GradesIn)
    {
        for(int i = 0; i < GradesIn.length; i++)
            {
                System.out.println("["+(i+1)+"]. Grade: "+GradesIn[i]);
            }
    }
}