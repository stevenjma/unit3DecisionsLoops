import java.util.Scanner;

public class Wave
{
    public static void main (String [] args)
    {
        Scanner supercalifragilisticespealadocious = new Scanner(System.in);
        System.out.println("Enter the wavelength in meters.");
        double wavelength = supercalifragilisticespealadocious.nextDouble();
        if (wavelength > 1e-2)
        {
            System.out.println("Radio Wave.");
        }
        else if (wavelength > 1e-4)
        {
            System.out.println("Microwave.");
        }
        else if (wavelength > 7e-8)
        {
            System.out.println("Infrared.");
        }
        else if (wavelength > 4e-8)
        {
            System.out.println("Visible Light.");
        }
        else if (wavelength > 1e-9)
        {
            System.out.println("Ultraviolet.");
        }
        else if (wavelength > 1e-12)
        {
            System.out.println("X-ray.");
        }
        else
        {
            System.out.println("Gamma ray.");
        }
    }
}