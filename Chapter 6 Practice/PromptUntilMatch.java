import java.util.Scanner;

public class PromptUntilMatch
{
    public static double promptUntilMatch()
    {
        boolean valid = false;
        double input;
        Scanner s = new Scanner(System.in);
        
        do
        {
            System.out.println("Enter a number");
            input = s.nextDouble();
            if (input > 0 && input < 100)
            {
                valid = true;
            }
        }
        while (!valid);
        
        return input;
    }
}