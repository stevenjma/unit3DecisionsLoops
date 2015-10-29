import java.util.Scanner;

public class Substring
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string.");
        String word = s.next();
        int length = word.length();
        int count = 0;
        while(count <= length)
        {
            int num = 0;
            while(num <= count && num + count <= length)
            {
                System.out.println(word.substring(num, num+ count));
                num++;
            }
            count++;
        }
    }
}