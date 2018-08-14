import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 strings: ");
        String sent1 = sc.nextLine();
        String sent2 = sc.nextLine();
        String sent3 = sc.nextLine();

        String[] comb = {sent1, sent2, sent3};

        Arrays.sort(comb);
        System.out.println("The sorted strings are: ");
        for (int i = 0; i < comb.length; i++)
        {
            System.out.println(comb[i]);
        }
    }
}
