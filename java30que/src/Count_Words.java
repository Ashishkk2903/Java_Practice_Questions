import java.util.Scanner;

public class Count_Words {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=1;
        for(int i=0;i<a.length()-1;i++)
        {
            if((a.charAt(i)==' ') && (a.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
