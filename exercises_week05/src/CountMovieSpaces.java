public class CountMovieSpaces
{
    public static void main(String args[])
    {
        String quote = "The stars are bright";

        int length = quote.length();
        //System.out.println(length);
        int count = 0;

        for (int i = 0; i < length; i++)
        {
            if (quote.charAt(i) == ' ')
           {
               count++;
           }
        }

        System.out.println("The total number of spaces in the entered quote is " + count);
    }
}
