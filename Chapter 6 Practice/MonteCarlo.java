import java.util.Scanner;

public class MonteCarlo
{
    public static void monteCarloTime()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of your circle.");
        double radius = s.nextDouble();
        double quarterofarea = (Math.pow(radius,2) * Math.PI)/4.0;
        double restofsquare = Math.pow(radius,2) - quarterofarea;
        double square = Math.pow(radius,2);
        double proportion = quarterofarea / square;
        for (int count = 0; count != 1000; count++)
        {
            double random = Math.random();
        }
    }
}