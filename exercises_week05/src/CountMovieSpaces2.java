import java.util.Scanner;

public class CountMovieSpaces2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite movie quote: ");
        String quote = sc.nextLine();

        int length = quote.length();
        int count = 0;

        for (int i = 0; i < length; i++)
        {
            if (Character.isWhitespace(quote.charAt(i)))
            {
                count++;
            }
        }

        System.out.println("The total number of spaces in the entered quote is " + count);
    }
}
