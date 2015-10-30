import java.util.Random;

public class DrunkardsWalk
{
    public static void walkAroundDrunk()
    {
        Random r = new Random();
        int x = 0;
        int y = 0;
        for (int i = 0; i != 100; i++)
        {
            int random = r.nextInt(5);
            if (random == 1)
            {
                x++;
            }
            else if (random == 2)
            {
                x--;
            }
            else if (random ==3)
            {
                y++;
            }
            else
            {
                y--;
            }
        }
        System.out.println(x + " " + y);
    }
}