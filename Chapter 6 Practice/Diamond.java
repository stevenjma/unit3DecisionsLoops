import java.util.Scanner;

public class Diamond
{
    public static void Diamond()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the diamond.");
        int width = s.nextInt();
        int count = 1;
        int space = width;
        while (count <= width)
        {
            int num = 1;
            System.out.println();
            for (int blah = 0; blah < space; blah++)
                {
                    System.out.print(" ");
                }
            while (num < (count * 2))
            {
                System.out.print("*");
                num++;
            }
            count++;
            space--;
        }
        while (count != 0)
        {
            int num = 1;
            System.out.println();
            for (int blah = 0; blah < space; blah++)
                {
                    System.out.print(" ");
                }
            while(num < (count* 2))
            {
                System.out.print("*");
                num++;
            }
            count--;
            space++;
        }
    }
}