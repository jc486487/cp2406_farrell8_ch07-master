import java.util.Scanner;

public class CountWords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("-|\\W+");
        int count = words.length;

        System.out.println("The total number of words: " + count);
    }
}
