import java.util.Scanner;

public class LeapYearViewer
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = s.nextInt();
        LeapYear leapyear = new LeapYear(year);
        leapyear.isLeapYear();
    }
}