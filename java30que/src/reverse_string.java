import java.util.Scanner;
import java.lang.StringBuffer;
public class reverse_string
{
    public static void main(String[] args)
    {
        String input="ashish";
//        StringBuffer sb=new StringBuffer(input);
//        StringBuffer rev=sb.reverse();
        int n=input.length();
        String rev="";
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        System.out.print(rev);

    }
}
