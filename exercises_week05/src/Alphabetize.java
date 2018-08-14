import java.util.Scanner;

public class Alphabetize
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 strings: ");
        String sent1 = sc.nextLine();
        String sent2 = sc.nextLine();
        String sent3 = sc.nextLine();

        String[] comb = {sent1, sent2, sent3};

        boolean sorted = true;
        for (int i = 0; i <comb.length; i++)
        {
            for (int j = i+1; j < comb.length; j++)
            {
                if (comb[i].compareTo(comb[j]) >= 0)
                {
                    sorted = false;
                }
            }
        }

        if (sorted = false)
        {
            System.out.println("The strings are sorted");
        }
        else
        {
            System.out.println("The Strings aren't sorted");
        }

    }
}
