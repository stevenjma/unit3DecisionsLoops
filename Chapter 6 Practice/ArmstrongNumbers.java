public class ArmstrongNumbers
{
    public static void numberStuff()
    {
        for (int i = 0; i < 1000; i++)
        {
            String number = ""+i;
            int total = 0;
            for(int l = 0; l < number.length(); l++)
            {
                total += Math.pow(Character.getNumericValue(number.charAt(l)),3);
            }
            if (total == i)
            {
                System.out.println(i + " is an Armstrong Number you fool!");
            }
        }
    }
}