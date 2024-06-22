import java.util.Scanner;
import java.lang.StringBuffer;
public class palindrome
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int oldnumber=a;
       int rev=0;
       while(a!=0)
       {
           rev=rev*10+a%10;
           a=a/10;
       }
       if(oldnumber==rev)
           System.out.print("its a palindrome");
       else
           System.out.print("not a palindrome");


    }
}
