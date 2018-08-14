import java.util.Scanner;

public class ValidatePassword
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password containing atleast 2 uppercase, 2 lowercase and 2 digits: ");
        String password = sc.nextLine();

        int length = password.length();

        while (length < 6)
        {
            System.out.println("The length should be 6 letters or more; " +
                    "with at least 2 uppercase, 2 lowercase and 2 digits. \nPlease enter" +
                    "again: ");
            password = sc.nextLine();
        }

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;


    }
}
