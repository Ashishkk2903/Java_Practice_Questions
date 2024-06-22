import java.util.Scanner;
import java.lang.StringBuffer;
public class palindrome_string
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String input=sc.next();
      StringBuffer sb=new StringBuffer(input);
      StringBuffer rev=sb.reverse();
      if(input.equals(String.valueOf(rev)))
      {
          System.out.print("true");
      }
      else
          System.out.print("false");
    }
}
