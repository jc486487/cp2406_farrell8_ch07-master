import java.util.Scanner;

public class ThreeLetterAcronym
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String words = sc.nextLine();
        String[] word = words.split("\\s+");

        String acroynm = "";
        char cr = ' ';
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++)
        {
            cr = word[i].charAt(0);
            sb.append(Character.toString(cr));
        }
        acroynm = sb.toString();
        acroynm = acroynm.toUpperCase();

        System.out.println(acroynm);
    }
}
