import java.util.Scanner;

public class Epsilon
{
    public static final double EPSILON = 1e-12;
    
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        double x = s.nextFloat();
        
        String adj = " ";
        if (Math.abs(x) < 1.0)
        {
            adj = "small ";
        }
        else if (Math.abs(x) > 1000000)
        {
            adj = "large ";
        }
        
        if ( Math.abs( x - 0 ) < EPSILON)
        {
            System.out.println("It's a zero");
        }
        else if (x > 0)
        {
            System.out.println("It's a " + adj + "positive number.");
        }
        else 
        {
            System.out.println("It's a " + adj + "negative number.");
        }
    }
}