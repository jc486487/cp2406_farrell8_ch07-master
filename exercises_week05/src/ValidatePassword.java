import java.util.Scanner;

public class ValidatePassword
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password containing at least 2 uppercase, 2 lowercase and 2 digits: ");
        String password = sc.nextLine();
        String pattern = "(?=.*[0-9]{2})(?=.*[a-z]{2})(?=.*[A-Z]{2})(?=\\S+$).{6,}";

        while (!password.matches(pattern))
        {
            System.out.println("The password is incorrect. \nEnter again: ");
            password = sc.nextLine();
        }

        System.out.println("The password is correct");
    }
}
