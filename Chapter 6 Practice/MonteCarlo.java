import java.util.Scanner;

public class MonteCarlo
{
    public static void monteCarloTime()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of your circle.");
        double radius = s.nextDouble();
        double quarterofarea = (Math.pow(radius,2) * Math.PI)/4.0;
        double a = quarterofarea * 4;
        double square = Math.pow(radius,2);
        double proportion = quarterofarea / square;
        double n = 0;
        for (int count = 0; count != 1000000; count++)
        {
            double random = Math.random();
            if (random < proportion)
            {
                n++;
            }
        }
        double calculatedproportion = n/1000000;
        double calculatedarea = calculatedproportion * square * 4;
        double calculatedpi = calculatedproportion * 4;
        System.out.println("Projected Area: " + calculatedarea);
        System.out.println("Actual Area: " + a);
        System.out.println("Projected Value of Pi: " + calculatedpi);
    }
}