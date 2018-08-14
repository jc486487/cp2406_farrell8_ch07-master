import java.util.Scanner;

public class BabyNameComparison
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 first names: ");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        String comp1, comp2, comp3;

        comp1 = name1 + " " + name2;
        comp2 = name1 + " " + name3;
        comp3 = name2 + " " + name3;

        System.out.println("These are the possible combinations for comparison: ");
        System.out.println(comp1 + " \n" + comp2 + "\n" + comp3);
    }
}
