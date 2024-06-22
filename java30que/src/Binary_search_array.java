import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_search_array {
    public  static  void main(String args[])
    {
        int a[] = {1, 45, 35, 4, 5};
        Arrays.sort(a);
        Scanner sc=new Scanner(System.in);
        int searched=sc.nextInt();
        int l=0;
        int h=a.length-1;

        boolean flag=false;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==searched)
            {
                System.out.print("found");
                flag=true;
                break;
            }
            if(a[mid]<searched)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(!flag)
        {
            System.out.print("element is not found in array");
        }
    }
}
