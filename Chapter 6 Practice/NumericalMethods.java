import java.util.Scanner;

public class NumericalMethods
{
    public static void fibonacciSequence()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Fibonacci sequence number you'd like.");
        int num = s.nextInt();
        int i = 0;
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
        while (i < num)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
            i++;
        }
        System.out.println(fnew);
    }
    
    public static void factorIntegers()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an integer.");
        int num = s.nextInt();
        int factor = 1;
        while (factor <= num)
        {
            if ((num % factor) == 0)
            {
                System.out.println(factor);
            }
            factor++;
        }
    }
    
    public static void primeNumbers()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int num = s.nextInt();
        int prime = 2;
        while (prime <= num)
        {
            int factor = 2;
            boolean isPrime = true;
            while(factor <= prime)
            {
                if ((prime % factor) == 0 && prime != factor)
                {
                    isPrime = false;
                }
                if (isPrime)
                {
                    System.out.println(prime);
                }
                factor++;
            }
            prime++;
        }
    }
}