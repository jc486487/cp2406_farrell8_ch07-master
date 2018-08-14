// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class FixDebugSeven2
{
   public static void main(String[] args)
   {
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = 0;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a series of integers separated by spaces >> ");
      String str = in.nextLine();
      length = str.length();
      for(x = 0; x <= length; ++x)
      {
         if(str.charAt(x) == ' ')
         {
             partStr = str.substring(x, lastSpace + 1);     
             num = Integer.parseInt(partStr);
             System.out.println("                " + num);
             start += num;
             lastSpace = x;
          } 
      }
      partStr = str.substring(lastSpace + 1, length);
      num = Integer.parseInt(partStr);
      System.out.println("                " + num);
      sum = start + num;
      System.out.println("         -------------------" +
         "\nThe sum of the integers is " + sum);
   }
}