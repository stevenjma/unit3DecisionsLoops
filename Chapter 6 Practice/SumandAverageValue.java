import java.util.Scanner;

public class SumandAverageValue
{
    public static double averageOfInputs()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a series of numbers and type a letter to quit.");
        
        double total = 0;
        int count = 0;
        
        while( s.hasNextDouble() )
        {
            double number = s.nextDouble();
            total += number;
            count++;
        }
        
        double average = 0;
        if (count > 0)
        {
            average = total / count;
        }
        
        return average;

    }
}