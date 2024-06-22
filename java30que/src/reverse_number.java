import java.util.Scanner;
import java.lang.StringBuffer;
public class reverse_number
{
    public static void main(String[] args)
    {
       int number=345;
//       int rev=0;
//       while(number!=0)
//       {
//           rev=rev*10+number%10;
//           number=number/10;
//       }
//       System.out.print(rev);

        //second approch

       StringBuffer sb=new StringBuffer(String.valueOf(number));
       StringBuffer reverse=sb.reverse();
       System.out.print(reverse);
    }
}
