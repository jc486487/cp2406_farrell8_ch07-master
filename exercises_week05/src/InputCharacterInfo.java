import java.util.Scanner;

public class InputCharacterInfo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char aChar = sc.next().charAt(0);
        System.out.println("The character is " + aChar);

        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");

        else
            System.out.println(aChar + " is not uppercase");

        if (Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");

        else
            System.out.println(aChar + " is not lowercase");

        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);

        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);

        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");

        else
            System.out.println(aChar + " is neither a letter nor a digit");

        if (Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");

        else
            System.out.println(aChar + " is not whitespace");
    }
}
