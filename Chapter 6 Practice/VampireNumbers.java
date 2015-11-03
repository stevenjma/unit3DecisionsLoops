

/**
 * Write a description of class VampireNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VampireNumbers{
    public static void vampireNumbers()
    {
        System.out.println("This program is working you fool.");
        for (int i = 0; i < 500000; i=i+9)
        {
            for (int j = i; j < 500000; j=j+9)
            {
                if (((i+j)%9)-(Integer.parseInt(i+""+j)%9)==0)
                {
                    System.out.println(i + "" + j + " is a vampire number!");
                }
            }
        }
    }
}