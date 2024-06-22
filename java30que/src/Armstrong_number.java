
import java.util.Scanner;
import java.math.*;
public class Armstrong_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count=0;
        int arm=0;
        int n=input;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        n=input;
        while(n>0)
        {
            int digit=n%10;
            arm+=Math.pow(digit,count);
            n=n/10;
        }
        if(input==arm)
            System.out.print("true");
        else
            System.out.print("false");


    }
}
